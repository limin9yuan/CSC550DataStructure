package Programming3_2_2;

/**
 * Created by Victor on 11/21/2015.
 * Package: Programming3_2_2
 * Project: Chapter3
 */
public class PalindromeFinder
{
    private String inputString;

    public PalindromeFinder(String str)
    {
        inputString = str;
        compare();
    }
    private boolean compare()
    {
        for (int i = 0; i < inputString.length(); i++)
        {
            Character front = inputString.charAt(i);
            Character rear = inputString.charAt(inputString.length() - 1 - i);
            String f = String.valueOf(front);
            String r = String.valueOf(rear);
            if (!f.equalsIgnoreCase(r))
                return false;
        }
        return true;
    }
    public String toString()
    {
        if (compare() == true)
            return (inputString + " Is palindrome");
        else
            return (inputString + " Not palindrome");
    }
}
