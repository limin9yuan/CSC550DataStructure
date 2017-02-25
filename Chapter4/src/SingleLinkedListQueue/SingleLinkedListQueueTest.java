package SingleLinkedListQueue;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: SingleLinkedListQueue
 * Project: Chapter4
 */
public class SingleLinkedListQueueTest
{
    public static void main(String[] args)
    {
        SingleLinkedListQueue<Integer> lq = new SingleLinkedListQueue<Integer>();
        int[] numbers = {1,2,3,4,5,6,7,8,9};
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
        for (int i = 0; i < lq.size(); i++)
        {
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
