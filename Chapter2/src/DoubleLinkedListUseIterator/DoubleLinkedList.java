package DoubleLinkedListUseIterator;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Created by Victor on 11/19/2015.
 * Package: DoubleLinkedListUseIterator
 * Project: Chapter2
 */
public class DoubleLinkedList<E>
{
    private static class Node<E>
    {
        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(E newData)
        {
            data = newData;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private class ListIter implements ListIterator<E>
    {
        private Node<E> nextItem;
        private Node<E> lastItemReturned;
        private int index;

        public ListIter(int i)
        {
            if (i < 0 || i > size)
                throw new IndexOutOfBoundsException();
            lastItemReturned = null;
            if (i == size)
            {
                nextItem = null;
                index = size;
            }
            else
            {
                nextItem = head;
                for (index = 0; index < i; index++)
                    nextItem = nextItem.next;
                lastItemReturned = nextItem;
            }
        }
        public boolean hasNext()
        {
            return nextItem != null;
        }
        public E next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            lastItemReturned = nextItem;
            nextItem = nextItem.next;
            index++;
            return lastItemReturned.data;
        }
        public int nextIndex()
        {
            return index;
        }
        public boolean hasPrevious()
        {
            return (nextItem == null && size != 0) || nextItem.prev != null;
        }
        public E previous()
        {
            if (!hasPrevious())
                throw new NoSuchElementException();
            if (nextItem == null)
                nextItem = tail;
            else
                nextItem = nextItem.prev;
            lastItemReturned = nextItem;
            index--;
            return lastItemReturned.data;
        }
        public int previousIndex()
        {
            return index - 1;
        }
        public void add(E obj)
        {
            if (head == null)
            {
                head = new Node<E>(obj);
                tail = head;
            }
            else if (nextItem == head)
            {
                Node<E> newNode = new Node<E>(obj);
                newNode.next = nextItem;
                nextItem.prev = newNode;
                head = newNode;
            }
            else if (nextItem == null)
            {
                Node<E> newNode = new Node<E>(obj);
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            else
            {
                Node<E> newNode = new Node<E>(obj);
                newNode.prev = nextItem.prev;
                nextItem.prev.next = newNode;
                newNode.next = nextItem;
                nextItem.prev = newNode;
            }
            index++;
            size++;
            lastItemReturned = null;
        }
        public void remove()
        {
            if (lastItemReturned == null)
                throw new IllegalStateException();
            if (lastItemReturned.next != null)
                lastItemReturned.next.prev = lastItemReturned.prev;
            else
            {
                tail = lastItemReturned.prev;
                if (tail != null)
                    tail.next = null;
                else
                    head = null;
            }
            if (lastItemReturned.prev != null)
                lastItemReturned.prev.next = lastItemReturned.next;
            else
            {
                head = lastItemReturned.next;
                if (head != null)
                    head.prev = null;
                else
                    tail = null;
            }
            index--;
            size--;
            lastItemReturned = null;
        }
        public void set(E obj)
        {
            if (lastItemReturned == null)
                throw new IllegalStateException();
            lastItemReturned.data = obj;
        }
    }

    public DoubleLinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
    public DoubleLinkedList(DoubleLinkedList<E> other)
    {
        head = other.head;
        tail = other.tail;
        size = other.size;
    }
    public Iterator<E> iterator()
    {
        return new ListIter(0);
    }
    public ListIterator<E> listIterator(int index)
    {
        return new ListIter(index);
    }
    public void addFirst(E obj)
    {
        listIterator(0).add(obj);
    }
    public void addLast(E obj)
    {
        listIterator(size).add(obj);
    }
    public void add(int index, E obj)
    {
        listIterator(index).add(obj);
    }
    public E get(int index)
    {
        return listIterator(index).next();
    }
    public E getFirst()
    {
        return listIterator(0).next();
    }
    public E getLast()
    {
        return listIterator(size).previous();
    }
    public E remove(int index)
    {
        E returnValue = get(index);
        listIterator(index).remove();
        return returnValue;
    }
    public boolean remove(E obj)
    {
        int index = indexOf(obj);
        if (index < 0)
            return false;
        else
        {
            listIterator(index).remove();
            return true;
        }
    }
    public int indexOf(E obj)
    {
        Node<E> temp = head;
        int i = 0;
        while (temp != null)
        {
            if (temp.data.equals(obj))
                return i;
            i++;
            temp = temp.next;
        }
        return -1;
    }
    public E set(int index, E obj)
    {
        E returnValue = get(index);
        listIterator(index).set(obj);
        return returnValue;
    }
    public String toString()
    {
        Node<E> temp = head;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.append(temp.data);
            if (temp.next != null)
                sb.append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
    public boolean equals(Object other)
    {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        else
        {
            DoubleLinkedList newList = (DoubleLinkedList) other;
            if (size != newList.size)
                return false;
            Node<E> temp = head;
            Node<E> newTemp = newList.head;
            while (temp != null)
            {
                if (!temp.data.equals(newTemp.data))
                    return false;
                temp = temp.next;
                newTemp = newTemp.next;
            }
            return true;
        }
    }
}
