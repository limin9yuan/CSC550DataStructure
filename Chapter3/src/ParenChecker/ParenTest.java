package ParenChecker;

/**
 * Created by Victor on 11/20/2015.
 * Package: ParenChecker
 * Project: Chapter3
 */
import javax.swing.JOptionPane;

public class ParenTest
{
    public static void main(String[] args)
    {
        String expression = JOptionPane.showInputDialog("Enter an expression containing parentheses.");
        if (ParenChecker.isBalanced(expression))
            JOptionPane.showMessageDialog(null, expression + " is balanced.");
        else
            JOptionPane.showMessageDialog(null, expression + " is not balanced.");
        System.exit(0);
    }
}
