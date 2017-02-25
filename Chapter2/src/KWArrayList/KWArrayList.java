package KWArrayList;

/**
 * Created by Victor on 2015/11/13.
 * Project name: Chapter2
 * Package name: KWArrayList
 */
import java.util.*;

public class KWArrayList<E>
{
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;
    private int size;
    private int capacity;

    public KWArrayList()
    {
        capacity = DEFAULT_CAPACITY;
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public KWArrayList(int initialCapacity)
    {
        capacity = initialCapacity;
        data = (E[]) new Object[capacity];
        size = 0;
    }
    public boolean add(E obj)
    {
        if (size == capacity)
            reallocate();
        data[size] = obj;
        size++;
        return true;
    }
    private void reallocate()
    {
        capacity = capacity * 2;
        data = Arrays.copyOf(data, capacity);
    }
    public void add(int index, E obj)
    {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException(index);
        if (size == capacity)
            reallocate();
        for (int i = size; i > index; i--)
            data[i] = data[i - 1];
        data[index] = obj;
        size++;
    }
    public E get(int index)
    {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(index);
        return data[index];
    }
    public E set(int index, E obj)
    {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException(index);
        E oldValue = data[index];
        data[index] = obj;
        return oldValue;
    }
    public E remove(int index)
    {
        E returnValue = get(index);
        for (int i = index; i < size; i++)
            data[i] = data[i + 1];
        size--;
        return returnValue;
    }
    public int indexOf(E obj)
    {
        for (int i = 0; i < size; i++)
        {
            if (data[i].equals(obj))
                return i;
        }
        return -1;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.append(data[i] + " ");
        }
        return sb.toString();
    }
}
