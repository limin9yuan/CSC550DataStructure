package ArrayListStack;

import StackInterface.StackInt;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by Victor on 11/23/2015.
 * Package: ArrayListStack
 * Project: Chapter3
 */
public class ArrayListStack<E> implements StackInt<E>
{
    private List<E> theData;

    public ArrayListStack()
    {
        theData = new ArrayList<E>();
    }
    public E push(E obj)
    {
        theData.add(obj);
        return obj;
    }
    public E peek()
    {
        if (empty())
            throw new EmptyStackException();
        return theData.get(theData.size() - 1);
    }
    public E pop()
    {
        if (empty())
            throw new EmptyStackException();
        return theData.remove(theData.size() - 1);
    }
    public boolean empty()
    {
        return theData.size() == 0;
    }
    public String toString()
    {
        return theData.toString();
    }
}
