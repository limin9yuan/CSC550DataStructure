package Programming3_2_1;

/**
 * Created by Victor on 11/21/2015.
 * Package: Programming3_2_1
 * Project: Chapter3
 */
import java.util.*;

public class StringReverse
{
    private String inputString;

    public StringReverse(String str)
    {
        inputString = str;
        reverse();
    }
    private String reverse()
    {
        Stack<String> strStack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        String[] tokens = inputString.split(" ");
         for (String token : tokens)
            strStack.push(token);
        while (!strStack.empty())
        {
            sb.append(strStack.pop());
            sb.append(" ");
        }
        return sb.toString();
    }
    public String toString()
    {
        return reverse();
    }
}
