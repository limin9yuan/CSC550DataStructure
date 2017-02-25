package ArrayStack;


import StackInterface.StackInt;

import java.util.EmptyStackException;

/**
 * Created by Victor on 11/23/2015.
 * Package: ArrayStack
 * Project: Chapter3
 */
public class ArrayStack<E> implements StackInt<E>
{
    private E[] data;
    private int topOfStack = -1;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack()
    {
        data = (E[]) new Object[INITIAL_CAPACITY];
    }
    public E push(E obj)
    {
        if (topOfStack == data.length - 1)
            reallocate();
        topOfStack++;
        data[topOfStack] = obj;
        return obj;
    }
    private void reallocate()
    {
        E[] newData = (E[]) new Object[INITIAL_CAPACITY * 2];
        for (int i = 0; i < data.length; i++)
            newData[i] = data[i];
        data = newData;
    }
    public E peek()
    {
        if (empty())
            throw new EmptyStackException();
        return data[topOfStack];
    }
    public E pop()
    {
        if (empty())
            throw new EmptyStackException();
        return data[topOfStack--];
    }
    public boolean empty()
    {
        return topOfStack < 0;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= topOfStack; i++)
        {
            sb.append(data[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
