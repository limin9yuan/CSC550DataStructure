package Programming3_2_3;

/**
 * Created by Mingyuan Li on 2015/11/23.
 * Package: Programming3_2_3
 * Project: Chapter3
 */
public class PalindromeFinder2
{
    private String inputString;

    public PalindromeFinder2(String str)
    {
        inputString = str;
    }
    public String buildReverse()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--)
        {
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }
    public boolean equals()
    {
        return inputString.equalsIgnoreCase(buildReverse());
    }
}
