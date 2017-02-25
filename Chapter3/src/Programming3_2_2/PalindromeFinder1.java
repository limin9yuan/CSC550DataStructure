package Programming3_2_2;

/**
 * Created by Mingyuan Li on 2015/11/23.
 * Package: Programming3_2_2
 * Project: Chapter3
 */
public class PalindromeFinder1
{
    private String inputString;

    public PalindromeFinder1(String str)
    {
        inputString = str;
    }
    public boolean compare()
    {
        for (int i = 0; i < inputString.length(); i++)
        {
            char front = inputString.charAt(i);
            char rear = inputString.charAt(inputString.length() - 1 - i);
            String f = String.valueOf(front);
            String r = String.valueOf(rear);
            if (!f.equalsIgnoreCase(r))
                return false;
        }
        return true;
    }
}
