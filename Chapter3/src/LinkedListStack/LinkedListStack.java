package LinkedListStack;

import StackInterface.StackInt;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Victor on 11/23/2015.
 * Package: LinkedListStack
 * Project: Chapter3
 */
public class LinkedListStack<E> implements StackInt<E>
{
    private List<E> data;

    public LinkedListStack()
    {
        data = new LinkedList<E>();
    }
    public E push(E obj)
    {
        data.add(obj);
        return obj;
    }
    public E peek()
    {
        if (empty())
            throw new EmptyStackException();
        return data.get(data.size() - 1);
    }
    public E pop()
    {
        if (empty())
            throw new EmptyStackException();
        return data.remove(data.size() - 1);
    }
    public boolean empty()
    {
        return data.size() == 0;
    }
    public String toString()
    {
        return data.toString();
    }
}
