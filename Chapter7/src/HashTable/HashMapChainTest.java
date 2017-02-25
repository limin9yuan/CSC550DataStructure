package HashTable;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: HashTable
 * Project: Chapter7
 */
public class HashMapChainTest
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> id = new HashTableChain<Integer, String>();
        id.put(1, "a");
        id.put(2, "b");
        id.put(3, "c");
        id.put(4, "d");
        id.put(5, "e");
        id.put(6, "f");
        id.put(7, "g");
        System.out.println("Change key map 7 to h return"+ " " + id.put(7, "h"));
        System.out.println("5 is map to " + id.get(5));
        System.out.println(id.toString());
        System.out.println("Table size is " + id.size());
        System.out.println("Remove Key 4 " + id.remove(4));
        System.out.println("After remove.");
        System.out.println(id.toString());
        System.out.println("After remove size is " + id.size());
    }
}
