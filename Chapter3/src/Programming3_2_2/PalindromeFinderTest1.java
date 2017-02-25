package Programming3_2_2;

/**
 * Created by Mingyuan Li on 2015/11/23.
 * Package: Programming3_2_2
 * Project: Chapter3
 */
public class PalindromeFinderTest1
{
    public static void main(String[] args)
    {
        PalindromeFinder1 pf = new PalindromeFinder1("Wow");
        if (pf.compare())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
        PalindromeFinder1 pf1 = new PalindromeFinder1("woe");
        if (pf1.compare())
            System.out.println("Is palindrome.");
        else
            System.out.println("Not palindrome.");
    }

}
