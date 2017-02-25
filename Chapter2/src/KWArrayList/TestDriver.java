package KWArrayList;

import java.util.Scanner;

/**
 * Created by Victor on 2015/11/13.
 * Project name: Chapter2
 * Package name: KWArrayList
 */
public class TestDriver
{
    public static void main(String[] args)
    {
        KWArrayList<Integer> intArray = new KWArrayList<Integer>();
        System.out.println("Fill array.");
        Scanner kbd = new Scanner(System.in);
        intArray = addArray(kbd);
        System.out.println(intArray.toString());
        intArray.set(0, 99);
        System.out.println(intArray.toString());
        intArray.add(1, 89);
        System.out.println(intArray.toString());
        intArray.remove(2);
        System.out.println(intArray.toString());
        System.out.println(intArray.indexOf(100));
    }
    public static KWArrayList addArray(Scanner kbd)
    {
        KWArrayList<Integer> intArray = new KWArrayList<Integer>();
        String input = kbd.nextLine();
        String tokens[] = input.split(" ");
        for (String token : tokens)
        {
            intArray.add(Integer.parseInt(token));
        }
        return intArray;
    }

}
