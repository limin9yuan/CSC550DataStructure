package HashTable;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: HashTable
 * Project: Chapter7
 */
public class HashTableOpen<K, V> implements HashMap<K, V>
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
            V returnValue = val;
            value = val;
            return returnValue;
        }
        public String toString()
        {
            return key.toString() + " = " + value.toString();
        }
    }
    private Entry<K, V>[] table;
    private static final int INITIAL_CAPACITY = 101;
    private int numKeys;
    private int numDeletes;
    private static final double LOAD_THRESHOLD = 0.75;
    private final Entry<K, V> DELETE = new Entry<K, V>(null, null);

    public HashTableOpen()
    {
        table = new Entry[INITIAL_CAPACITY];
    }
    private int find(Object key)
    {
        int index = key.hashCode() % table.length;
        if (index < 0)
            index += table.length;
        while ((table[index] != null) && (!key.equals(table[index].key)))
        {
            index++;
            if (index >= table.length)
                index = 0;
        }
        return index;
    }
    public V get(Object key)
    {
        int index = find(key);
        if (table[index] != null)
            return table[index].value;
        else
            return null;
    }
    public V put(K key, V value)
    {
        int index = find(key);
        if (table[index] != null)
        {
            V returnValue = table[index].setValue(value);
            return returnValue;
        }
        else
        {
            table[index] = new Entry<K, V>(key, value);
            numKeys++;
            double loadFactor = (double) (numKeys + numDeletes) / table.length;
            if (loadFactor > LOAD_THRESHOLD)
                reHash();
            return null;
        }
    }
    private void reHash()
    {
        Entry<K, V>[] oldTable = table;
        table = new Entry[oldTable.length * 2 + 1];
        numKeys = 0;
        numDeletes = 0;
        for (int i = 0; i < oldTable.length; i++)
        {
            if (oldTable[i] != null && oldTable[i] != DELETE)
                put(oldTable[i].key, oldTable[i].value);
        }
    }
    public V remove(Object key)
    {
        int index = find(key);
        if (table[index] != null)
        {
            V returnValue = table[index].value;
            table[index] = DELETE;
            numDeletes++;
            numKeys--;
            return returnValue;
        }
        else
            return null;
    }
    public int size()
    {
        return numKeys;
    }
    public boolean isEmpty()
    {
        return numKeys == 0;
    }
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++)
        {
            if (table[i] != null && table[i] != DELETE)
            {
                sb.append(table[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
