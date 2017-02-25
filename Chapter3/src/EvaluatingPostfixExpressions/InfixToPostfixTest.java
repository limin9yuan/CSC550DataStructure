package EvaluatingPostfixExpressions;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: EvaluatingPostfixExpressions
 * Project: Chapter3
 */
public class InfixToPostfixTest
{
    public static void main(String[] args) throws InfixToPostfix.SyntaxErrorException
    {
        InfixToPostfix ip = new InfixToPostfix();
        String result = ip.convert("w - 5.1 / sum * 2");
        System.out.println(result);
    }
}
