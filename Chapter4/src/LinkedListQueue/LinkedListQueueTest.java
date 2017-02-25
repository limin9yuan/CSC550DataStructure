package LinkedListQueue;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: LinkedListQueue
 * Project: Chapter4
 */
public class LinkedListQueueTest
{
    public static void main(String[] args)
    {
        LinkedListQueue<Integer> lq = new LinkedListQueue<Integer>();
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (Integer number : numbers)
            lq.offer(number);
        System.out.println(lq.peek());
        System.out.println(lq.element());
        System.out.println(lq.remove());
        System.out.println(lq.size());
        while (!lq.isEmpty())
            System.out.println(lq.poll());
    }
}
