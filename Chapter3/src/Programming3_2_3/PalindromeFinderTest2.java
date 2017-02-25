package Programming3_2_3;

/**
 * Created by Mingyuan Li on 2015/11/23.
 * Package: Programming3_2_3
 * Project: Chapter3
 */
public class PalindromeFinderTest2
{
    public static void main(String[] args)
    {
        PalindromeFinder2 pf = new PalindromeFinder2("Wow");
        if (pf.equals())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
        PalindromeFinder2 pf1 = new PalindromeFinder2("Woe");
        if (pf1.equals())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
    }
}
