package Programming4_3_4;

/**
 * Created by Mingyuan Li on 2015/12/2.
 * Package: Programming4_3_4
 * Project: Chapter4
 */
public class TestArrayQueue
{
    public static void main(String[] args)
    {
        ArrayQueue<Integer> lq = new ArrayQueue<Integer>();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (Integer number : numbers)
            lq.offer(number);
        System.out.println(lq.peek());
        System.out.println(lq.element());
        System.out.println(lq.remove());
        System.out.println(lq.size());
        if (lq.iterator().hasNext())
            System.out.println("True");
        else
            System.out.println("False");
        for (int i = 0; i < lq.size(); i++) {
            System.out.println(lq.iterator().next());
        }
        System.out.println();
        while (!lq.isEmpty())
            System.out.println(lq.poll());
        if (lq.iterator().hasNext())
            System.out.println("True");
        else
            System.out.println("False");
    }
}
