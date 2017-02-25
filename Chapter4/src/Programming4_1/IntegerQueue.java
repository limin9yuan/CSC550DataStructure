package Programming4_1;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: Programming4_1
 * Project: Chapter4
 */
import java.util.*;

public class IntegerQueue
{
    public static void main(String[] args)
    {
        Stack<Integer> intStack1 = new Stack<Integer>();
        Stack<Integer> intStack2 = new Stack<Integer>();
        Queue<Integer> intQueue = new LinkedList<Integer>();
        int[] nums = {-1,15,23,44,4,99};
        for (Integer num : nums)
            intStack1.push(num);
        while (!intStack1.empty())
        {
            int num = intStack1.pop();
            intQueue.offer(num);
            intStack2.push(num);
        }
        System.out.println("Numbers in second stack.");
        while (!intStack2.empty())
            System.out.println(intStack2.pop());
        System.out.println();
        System.out.println("Numbers in queue.");
        while (!intQueue.isEmpty())
            System.out.println(intQueue.poll());
    }
}
