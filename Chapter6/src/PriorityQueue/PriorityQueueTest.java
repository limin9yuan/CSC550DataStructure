package PriorityQueue;

/**
 * Created by Mingyuan Li on 2015/12/3.
 * Package: PriorityQueue
 * Project: Chapter6
 */
public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> ah = new PriorityQueue<Integer>();
        ah.offer(6);
        ah.offer(18);
        ah.offer(29);
        ah.offer(20);
        ah.offer(28);
        ah.offer(39);
        ah.offer(66);
        ah.offer(37);
        ah.offer(26);
        ah.offer(76);
        ah.offer(32);
        ah.offer(74);
        ah.offer(89);
        ah.offer(8);
        System.out.println(ah.toString());
        System.out.println(ah.peek());
        System.out.println(ah.element());
        System.out.println(ah.remove());
        System.out.println(ah.poll());
        System.out.println(ah.toString());
    }
}
