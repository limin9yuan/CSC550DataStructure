package ParenChecker;

/**
 * Created by Victor on 11/20/2015.
 * Package: ParenChecker
 * Project: Chapter3
 */
import java.util.*;

public class ParenChecker
{
    private static final String OPEN = "([{";
    private static final String CLOSE = ")]}";

    public static boolean isBalanced(String expression)
    {
        Stack<Character> charStack = new Stack<Character>();
        boolean balanced = true;
        try
        {
            for (int index = 0; balanced && index < expression.length(); index++)
            {
                char nextCh = expression.charAt(index);
                if (isOpen(nextCh))
                    charStack.push(nextCh);
                else if (isClose(nextCh))
                {
                    char topCh = charStack.pop();
                    balanced = OPEN.indexOf(topCh) == CLOSE.indexOf(nextCh);
                }
            }
        }
        catch (EmptyStackException e)
        {
            balanced = false;
        }
        return (balanced && charStack.empty());
    }
    private static boolean isOpen(char ch)
    {
        return OPEN.indexOf(ch) > -1;
    }
    private static boolean isClose(char ch)
    {
        return CLOSE.indexOf(ch) > -1;
    }
}
