package Programming3_2_3;

/**
 * Created by Victor on 11/22/2015.
 * Package: Programming3_2_3
 * Project: Chapter3
 */
public class PalindromeChecker
{
    private String inputString;

    public PalindromeChecker(String str)
    {
        inputString = str;
    }
    public String buildReverse()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i-- )
            sb.append(inputString.charAt(i));
        return sb.toString();
    }
    public boolean equals()
    {
        return inputString.equalsIgnoreCase(buildReverse());
    }
}
