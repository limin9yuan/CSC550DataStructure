package Palindrome;

import java.util.Stack;

/**
 * Created by Victor on 11/20/2015.
 * Package: CaseStudy3_2
 * Project: Chapter3
 */
public class PalindromeFinder3
{
    private String inputString;
    private Stack<Character> charStack = new Stack<Character>();

    public PalindromeFinder3(String str)
    {
        inputString = str;
        fillStack();
    }
    private void fillStack()
    {
        for (int i = 0; i < inputString.length(); i++)
            charStack.push(inputString.charAt(i));
    }
    private String buildReverse()
    {
        StringBuilder sb = new StringBuilder();
        while (!charStack.empty())
            sb.append(charStack.pop());
        return sb.toString();
    }
    public boolean isPalindrome()
    {
        return inputString.equalsIgnoreCase(buildReverse());
    }
}
