package ArrayListStack;

/**
 * Created by Victor on 11/23/2015.
 * Package: ArrayListStack
 * Project: Chapter3
 */
public class ArrayListStackTest
{
    public static void main(String[] args)
    {
        ArrayListStack<Integer> intStack = new ArrayListStack<Integer>();
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
