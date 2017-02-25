package PriorityQueue;

import java.util.*;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: PriorityQueue
 * Project: Chapter6
 */
public class PriorityQueue<E> extends AbstractQueue<E> implements Queue<E>
{
    private ArrayList<E> theData;
    Comparator<E> comparator = null;

    public PriorityQueue()
    {
        theData = new ArrayList<E>();
    }
    public PriorityQueue(int capacity, Comparator<E> comp)
    {
        if (capacity < 1)
            throw new IllegalArgumentException();
        theData = new ArrayList<E>();
        comparator = comp;
    }
    private int parent(int child)
    {
        if (child > 0)
            return (child - 1) / 2;
        else
            return -1;
    }
    private int leftChild(int parent)
    {
        return parent * 2 + 1;
    }
    private int rightChild(int parent)
    {
        return parent * 2 + 2;
    }
    public boolean offer(E obj)
    {
        theData.add(obj);
        bubbleUp(theData.size() - 1);
        return true;
    }
    private void bubbleUp(int child)
    {
        int parIndex = parent(child);
        while (parIndex >= 0 && compare(theData.get(parIndex), theData.get(child)) > 0)
        {
            swap(parIndex, child);
            child = parIndex;
            parIndex = parent(child);
        }
    }
    private void swap(int i, int j)
    {
        E value = theData.get(i);
        theData.set(i, theData.get(j));
        theData.set(j, value);
    }
    private int compare(E left, E right)
    {
        if (comparator != null)
            return comparator.compare(left, right);
        else
            return ((Comparable<E>) left).compareTo(right);
    }
    public E poll()
    {
        if (isEmpty())
            return null;
        E returnValue = theData.get(0);
        theData.set(0, theData.get(theData.size() - 1));
        theData.remove(theData.size() - 1);
        bubbleDown(0);
        return returnValue;
    }
    private void bubbleDown(int parent)
    {
        int minChildIndex = getMinChildIndex(parent);
        while (minChildIndex != -1 && compare(theData.get(parent), theData.get(minChildIndex)) > 0 )
        {
            swap(minChildIndex, parent);
            parent = minChildIndex;
            minChildIndex = getMinChildIndex(parent);
        }
    }
    private int getMinChildIndex(int parent)
    {
        if (leftChild(parent) > theData.size() - 1)
            return -1;
        if (rightChild(parent) > theData.size() - 1)
            return leftChild(parent);
        int comResult = compare(theData.get(leftChild(parent)), theData.get(rightChild(parent)));
        if (comResult <= 0)
            return leftChild(parent);
        else
            return rightChild(parent);
    }
    public boolean isEmpty()
    {
        return theData.size() == 0;
    }
    public Iterator<E> iterator()
    {
        return theData.iterator();
    }
    public int size()
    {
        return theData.size();
    }
    public E peek()
    {
        if (isEmpty())
            return null;
        else
            return theData.get(0);
    }
    public E remove()
    {
        if (isEmpty())
            throw new NoSuchElementException();
        E returnValue = peek();
        theData.set(0, theData.get(size() - 1));
        theData.remove(size() - 1);
        bubbleDown(0);
        return returnValue;
    }
    public E element()
    {
        if (isEmpty())
            throw new NoSuchElementException();
        else
            return theData.get(0);
    }
}
