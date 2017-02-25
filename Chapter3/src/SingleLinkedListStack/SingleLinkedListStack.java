package SingleLinkedListStack;

import StackInterface.StackInt;

import java.util.EmptyStackException;

/**
 * Created by Victor on 11/23/2015.
 * Package: SingleLinkedListStack
 * Project: Chapter3
 */
public class SingleLinkedListStack<E> implements StackInt<E>
{
    private static class Node<E>
    {
        private E data;
        private Node<E> next;

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
    private Node<E> topOfStackRef = null;

    public E push(E obj)
    {
        topOfStackRef = new Node<E>(obj, topOfStackRef);
        return obj;
    }
    public E peek()
    {
        if (empty())
            throw new EmptyStackException();
        return topOfStackRef.data;
    }
    public E pop()
    {
        if (empty())
            throw new EmptyStackException();
        E returnValue = topOfStackRef.data;
        topOfStackRef = topOfStackRef.next;
        return returnValue;
    }
    public boolean empty()
    {
        return topOfStackRef == null;
    }
    public String toString()
    {
        Node<E> temp = topOfStackRef;
        StringBuilder sb = new StringBuilder();
        while (temp != null)
        {
            sb.append(temp.data);
            if (temp.next != null)
                sb.append(" ");
            temp = temp.next;
        }
        return sb.toString(); 
    }
    public int size()
    {
        Node<E> temp = topOfStackRef;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
