package HashTable;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: HashTable
 * Project: Chapter7
 */
public class HashTableChain<K, V> implements HashMap<K, V>
{
    private static class Entry<K, V>
    {
        private K key;
        private V value;

        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
        public K getKey()
        {
            return key;
        }
        public V getValue()
        {
            return value;
        }
        public V setValue(V val)
        {
            V returnValue = value;
            value = val;
            return returnValue;
        }
        public String toString()
        {
            return key.toString() + " = " + value.toString();
        }
    }
    private LinkedList<Entry<K ,V>>[] table;
    private static final int INITIAL_CAPACITY = 101;
    private int numKeys;
    private static final double LOAD_THRESHOLD = 3.0;

    public HashTableChain()
    {
        table = new LinkedList[INITIAL_CAPACITY];
    }
    private int find(Object key)
    {
        int index = key.hashCode() % table.length;
        if (index < 0)
            index += table.length;
        return index;
    }
    public V get(Object key)
    {
        int index = find(key);
        if (table[index] != null)
        {
            for (Entry<K ,V> nextItem : table[index])
            {
                if (key.equals(nextItem.key))
                    return nextItem.value;
            }
        }
        return null;
    }
    public V put(K key, V value)
    {
        int index = find(key);
        if (table[index] != null)
        {
            for (Entry<K, V> nextItem : table[index])
            {
                if (key.equals(nextItem.key))
                    return nextItem.setValue(value);
            }
        }
        table[index] = new LinkedList<Entry<K, V>>();
        table[index].addLast(new Entry<K, V>(key, value));
        numKeys++;
        if (numKeys > (LOAD_THRESHOLD * table.length))
            reHash();
        return null;
    }
    private void reHash()
    {
        LinkedList<Entry<K, V>>[] oldTable = table;
        table = new LinkedList[oldTable.length * 2 + 1];
        numKeys = 0;
        for (int i = 0; i < oldTable.length; i++)
        {
            if (oldTable[i] != null)
            {
                for (Entry<K, V> nextItem : oldTable[i])
                {
                    if (nextItem != null)
                        put(nextItem.key, nextItem.value);
                }
            }
        }
    }
    public V remove(Object key)
    {
        int index = find(key);
        if (table[index] != null)
        {
            for (Entry<K, V> nextItem : table[index])
            {
                if (key.equals(nextItem.key))
                {
                    V returnValue = nextItem.value;
                    table[index].remove(nextItem);
                    numKeys--;
                    if (table[index].isEmpty())
                        table[index] = null;
                    return returnValue;
                }
            }
        }
        return null;
    }
    public boolean isEmpty()
    {
        return numKeys == 0;
    }
    public int size()
    {
        return numKeys;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++)
        {
            if (table[i] != null)
            {
                ListIterator<Entry<K, V>> iter = table[i].listIterator();
                while (iter.hasNext())
                {
                    sb.append(iter.next());
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
