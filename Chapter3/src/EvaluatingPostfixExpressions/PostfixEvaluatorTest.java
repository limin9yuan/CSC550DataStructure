package EvaluatingPostfixExpressions;

/**
 * Created by Victor on 11/30/2015.
 * Package: EvaluatingPostfixExpressions
 * Project: Chapter3
 */
public class PostfixEvaluatorTest
{
    public static void main(String[] args) throws PostfixEvaluator.SyntaxErrorException
    {
        PostfixEvaluator pe = new PostfixEvaluator();
        int result = pe.eval("4 7 * 20 -");
        System.out.println(result);
    }
}
