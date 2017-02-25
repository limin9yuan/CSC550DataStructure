package Programming3_2_2;

/**
 * Created by Victor on 11/22/2015.
 * Package: Programming3_2_2
 * Project: Chapter3
 */
public class PalindromeFinderTest
{
    public static void main(String[] args)
    {
        PalindromeFinder pf = new PalindromeFinder("Wow");
        System.out.println(pf.toString());
        PalindromeFinder pf1 = new PalindromeFinder("woe");
        System.out.println(pf1.toString());
    }
}
