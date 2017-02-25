package ArrayStack;

/**
 * Created by Victor on 11/23/2015.
 * Package: ArrayStack
 * Project: Chapter3
 */
public class ArrayStackTest
{
    public static void main(String[] args)
    {
        ArrayStack<Integer> intStack = new ArrayStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);
        intStack.push(6);
        intStack.push(7);
        intStack.push(8);
        intStack.push(9);
        intStack.push(10);
        intStack.push(11);
        System.out.println(intStack.peek());
        System.out.println();
        System.out.println(intStack.toString());
        System.out.println();
        while (!intStack.empty())
            System.out.println(intStack.pop());
    }
}
