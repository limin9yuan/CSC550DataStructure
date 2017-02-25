package Programming3_2_3;

/**
 * Created by Victor on 11/22/2015.
 * Package: Programming3_2_3
 * Project: Chapter3
 */
public class PalindromeCheckerTest
{
    public static void main(String[] args)
    {
        PalindromeChecker pc = new PalindromeChecker("Wow");
        if (pc.equals())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
        PalindromeChecker pc1 = new PalindromeChecker("Woe");
        if (pc1.equals())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
    }
}
