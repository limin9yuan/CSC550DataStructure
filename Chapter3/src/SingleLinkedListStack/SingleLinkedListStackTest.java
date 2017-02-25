package SingleLinkedListStack;

/**
 * Created by Victor on 11/23/2015.
 * Package: SingleLinkedListStack
 * Project: Chapter3
 */
public class SingleLinkedListStackTest
{
    public static void main(String[] args)
    {
        SingleLinkedListStack<Integer> intStack = new SingleLinkedListStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(100);
        System.out.println(intStack.peek());
        System.out.println();
        System.out.println(intStack.toString());
        System.out.println();
        System.out.println(intStack.size());
        System.out.println();
        while (!intStack.empty())
        {
            System.out.println(intStack.pop());
        }
    }
}
