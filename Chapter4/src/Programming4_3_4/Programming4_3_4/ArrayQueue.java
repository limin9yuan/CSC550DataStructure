package Programming4_3_4;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by Mingyuan Li on 2015/12/2.
 * Package: Programming4_3_4
 * Project: Chapter4
 */
public class ArrayQueue<E> extends AbstractQueue<E> implements Queue<E>
{
    private int front;
    private int rear;
    private static final int INITIAL_CAPACITY = 10;
    private int size;
    private int capacity;
    private E[] theData;

    public ArrayQueue()
    {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }
    public ArrayQueue(int initCapacity)
    {
        capacity = initCapacity;
        theData = (E[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }
    public boolean offer(E obj)
    {
        if (size == capacity)
            reallocate();
        rear = (rear + 1) % capacity;
        theData[rear] = obj;
        size++;
        return true;
    }
    private void reallocate()
    {
        int newCapacity = capacity * 2;
        E[] newData = (E[]) new Object[newCapacity];
        System.arraycopy(theData, 0, newData, 0, size);
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
        theData = newData;
    }
    public E peek()
    {
        if (size == 0)
            return null;
        else
            return theData[front];
    }
    public E element()
    {
        if (size == 0)
            throw new NoSuchElementException();
        else
            return theData[front];
    }
    public E poll()
    {
        if (size == 0)
            return null;
        E returnValue = peek();
        front = (front + 1) % capacity;
        size--;
        return returnValue;
    }
    public E remove()
    {
        if (size == 0)
            throw new NoSuchElementException();
        E returnValue = peek();
        front = (front + 1) % capacity;
        size--;
        return returnValue;
    }
    public int size()
    {
        return size;
    }
    public Iterator<E> iterator()
    {
        return new Iter();
    }
    private class Iter implements Iterator<E>
    {
        private int index;
        private int count = 0;

        public Iter()
        {
            index = front;
        }
        public boolean hasNext()
        {
            return count < size;
        }
        public E next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            E returnValue = theData[index];
            index = (index + 1) % capacity;
            count++;
            return returnValue;
        }
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
}
