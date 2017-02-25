package LinkedListStack;

/**
 * Created by Victor on 11/23/2015.
 * Package: LinkedListStack
 * Project: Chapter3
 */
public class LinkedListStackTest
{
    public static void main(String[] args)
    {
        LinkedListStack<Integer> intStack = new LinkedListStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println(intStack.peek());
        System.out.println();
        System.out.println(intStack.toString());
        System.out.println();
        while (!intStack.empty())
        {
            System.out.println(intStack.pop());
        }
    }
}
