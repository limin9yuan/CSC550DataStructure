package Programming2_4;

/**
 * Created by Victor on 11/14/2015.
 */
import java.util.*;

public class Compares
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter N.");
            int n = kbd.nextInt();
            if (n >= 0)
            {
                compare(n);
            }
            else
                break;
        }
    }
    private static int computeY1(int n)
    {
        int y1 = 100 * n + 10;
        return y1;
    }
    private static int computeY2(int n)
    {
        int y2 = 5 * n * n + 2;
        return y2;
    }
    public static void compare(int n)
    {
        int y1 = computeY1(n);
        int y2 = computeY2(n);
        if (y1 > y2)
            System.out.println("Y1 > Y2");
        else
            System.out.println("Y2 > Y1");
    }
}
