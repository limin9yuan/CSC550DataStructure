package Programming3_1;

/**
 * Created by Victor on 11/20/2015.
 * Package: Programming3_1
 * Project: Chapter3
 */
import java.util.*;

public class IntegerStack
{
    public static void main(String[] args)
    {
        int[] nums = {-1, 15, 23, 44, 4, 99};
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();
        for (Integer num : nums)
        {
            stack1.push(num);
            stack2.push(num);
        }
        while (!stack1.empty())
        {
            stack3.push(stack1.pop());
        }
        System.out.println("Second Stack.");
        while (!stack2.empty())
        {
            System.out.println(stack2.pop());
        }
        System.out.println("Third Stack.");
        while (!stack3.empty())
        {
            System.out.println(stack3.pop());
        }
    }
}
