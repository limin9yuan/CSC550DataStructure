package Palindrome;

import Palindrome.PalindromeFinder;

/**
 * Created by Victor on 11/20/2015.
 * Package: CaseStudy3_2
 * Project: Chapter3
 */
public class PalindromeTest
{
    public static void main(String[] args)
    {
        PalindromeFinder pf = new PalindromeFinder("was saw");
        if (pf.isPalindrome())
            System.out.println("True.");
        else
            System.out.println("False.");
        PalindromeFinder pf1 = new PalindromeFinder("Was");
        if (pf1.isPalindrome())
            System.out.println("True.");
        else
            System.out.println("False.");
    }
}
