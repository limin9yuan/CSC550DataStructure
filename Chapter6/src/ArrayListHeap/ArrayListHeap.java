package ArrayListHeap;

import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: ArrayListHeap
 * Project: Chapter6
 */
public class ArrayListHeap<E extends Comparable<E>>
{
    private ArrayList<E> arrayListHeap;

    public ArrayListHeap()
    {
        arrayListHeap = new ArrayList<E>();
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
    public void add(E obj)
    {
        arrayListHeap.add(obj);
        bubbleUp(size() - 1);
    }
    private int size()
    {
        return arrayListHeap.size();
    }
    private void bubbleUp(int child)
    {
        int parIndex = parent(child);
        while (parIndex >= 0 && arrayListHeap.get(parIndex).compareTo(arrayListHeap.get(child)) > 0)
        {
            swap(parIndex, child);
            child = parIndex;
            parIndex = parent(child);
        }
    }
    private void swap(int i, int j)
    {
        E value = arrayListHeap.get(i);
        arrayListHeap.set(i, arrayListHeap.get(j));
        arrayListHeap.set(j, value);
    }
    public E remove()
    {
        E returnValue = arrayListHeap.get(0);
        arrayListHeap.set(0, arrayListHeap.get(size() - 1));
        arrayListHeap.remove(size() - 1);
        bubbleDown(0);
        return returnValue;
    }
    private void bubbleDown(int parent)
    {
        int minChildIndex = getMinChildIndex(parent);
        while (minChildIndex != -1 && arrayListHeap.get(parent).compareTo(arrayListHeap.get(minChildIndex)) > 0)
        {
            swap(parent, minChildIndex);
            parent = minChildIndex;
            minChildIndex = getMinChildIndex(parent);
        }
    }
    private int getMinChildIndex(int parent)
    {
        if (leftChild(parent) > size() - 1)
            return -1;
        if (rightChild(parent) > size() - 1)
            return leftChild(parent);
        int comResult = arrayListHeap.get(leftChild(parent)).compareTo(arrayListHeap.get(rightChild(parent)));
        if (comResult <= 0)
            return leftChild(parent);
        else
            return rightChild(parent);
    }
    public String toString()
    {
        return arrayListHeap.toString();
    }
}
