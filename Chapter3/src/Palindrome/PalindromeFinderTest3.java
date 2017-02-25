package Palindrome;

/**
 * Created by Victor on 11/20/2015.
 * Package: CaseStudy3_2
 * Project: Chapter3
 */
public class PalindromeFinderTest3
{
    public static void main(String[] args)
    {
        PalindromeFinder3 pf = new PalindromeFinder3("was saW");
        if (pf.isPalindrome())
            System.out.println("True.");
        else
            System.out.println("False.");
        PalindromeFinder3 pf1 = new PalindromeFinder3("Was");
        if (pf1.isPalindrome())
            System.out.println("True.");
        else
            System.out.println("False.");
    }
}
