package EvaluatingPostfixExpressions;

/**
 * Created by Victor on 11/30/2015.
 * Package: EvaluatingPostfixExpressions
 * Project: Chapter3
 */
import java.util.*;

public class PostfixEvaluator
{
    public static class SyntaxErrorException extends Exception
    {
        SyntaxErrorException(String message)
        {
            super(message);
        }
    }
    private static final String OPERATOR = "+-*/";
    private Stack<Integer> operandStack;

    private int evalOp(char op)
    {
        int rhs = operandStack.pop();
        int lhs = operandStack.pop();
        int result = 0;
        switch (op)
        {
            case '+': result = lhs + rhs;
                break;
            case '-': result = lhs - rhs;
                break;
            case '*': result = lhs * rhs;
                break;
            case '/': result = lhs / rhs;
        }
        return result;
    }
    private boolean isOperator(char op)
    {
        return OPERATOR.indexOf(op) != -1;
    }
    public int eval(String expression) throws SyntaxErrorException
    {
        operandStack = new Stack<Integer>();
        String[] tokens = expression.split("\\s+");
        try
        {
            for (String token : tokens)
            {
                char firstChar = token.charAt(0);
                if (Character.isDigit(firstChar))
                {
                    int value = Integer.parseInt(token);
                    operandStack.push(value);
                }
                else if (isOperator(firstChar))
                {
                    int result = evalOp(firstChar);
                    operandStack.push(result);
                }
                else
                    throw new SyntaxErrorException("Invalid Character " + firstChar);
            }
            int answer = operandStack.pop();
            if (operandStack.empty())
                return answer;
            else
                throw new SyntaxErrorException("Stack is not empty.");
        }
        catch (SyntaxErrorException e)
        {
            throw new SyntaxErrorException("Stack is empty.");
        }
    }
}
