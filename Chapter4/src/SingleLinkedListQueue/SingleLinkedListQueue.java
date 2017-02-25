package SingleLinkedListQueue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: SingleLinkedListQueue
 * Project: Chapter4
 */
public class SingleLinkedListQueue<E> extends AbstractQueue<E> implements Queue<E>
{
    private static class Node<E>
    {
        private Node<E> next;
        private E data;

        public Node(E newData)
        {
            data = newData;
        }
        public Node(E newData, Node<E> nodeRef)
        {
            data = newData;
            next = nodeRef;
        }
    }
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public boolean offer(E obj)
    {
        if (front == null)
        {
            rear = new Node<E>(obj);
            front = rear;
        }
        else
        {
            rear.next = new Node<E>(obj);
            rear = rear.next;
        }
        size++;
        return true;
    }
    public E poll()
    {
        E returnValue = peek();
        if (front == null)
            return null;
        front = front.next;
        size--;
        return returnValue;
    }
    public E remove()
    {
        E returnValue = peek();
        if (front == null)
            throw new NoSuchElementException();
        front = front.next;
        size--;
        return returnValue;
    }
    public E peek()
    {
        if (front == null)
            return null;
        else
            return front.data;
    }
    public E element()
    {
        if (front == null)
            throw new NoSuchElementException();
        else
            return front.data;
    }
    private class Iter implements Iterator<E>
    {
        private Node<E> current;
        private int count;

        public Iter()
        {
            current = front;
        }
        public boolean hasNext()
        {
            return count < size;
        }
        public E next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            E returnValue = current.data;
            current = current.next;
            count++;
            return returnValue;
        }
        public void remove()
        {
            throw new UnsupportedOperationException();
        }
    }
    public Iterator iterator()
    {
        return new Iter();
    }
    public int size()
    {
        return size;
    }
}
