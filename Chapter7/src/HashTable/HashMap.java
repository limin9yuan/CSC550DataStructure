package HashTable;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: HashTable
 * Project: Chapter7
 */
public interface HashMap<K, V>
{
    V get(Object key);
    boolean isEmpty();
    V put(K key, V value);
    V remove(Object key);
    int size();
}
