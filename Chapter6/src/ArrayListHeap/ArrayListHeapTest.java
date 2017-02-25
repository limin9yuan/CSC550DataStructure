package ArrayListHeap;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: ArrayListHeap
 * Project: Chapter6
 */
public class ArrayListHeapTest
{
    public static void main(String[] args)
    {
        ArrayListHeap<Integer> ah = new ArrayListHeap<Integer>();
        ah.add(6);
        ah.add(18);
        ah.add(29);
        ah.add(20);
        ah.add(28);
        ah.add(39);
        ah.add(66);
        ah.add(37);
        ah.add(26);
        ah.add(76);
        ah.add(32);
        ah.add(74);
        ah.add(89);
        ah.add(8);
        System.out.println(ah.toString());
        System.out.println(ah.remove());
        System.out.println(ah.toString());
    }
}
