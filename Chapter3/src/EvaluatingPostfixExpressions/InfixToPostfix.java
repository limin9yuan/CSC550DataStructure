package EvaluatingPostfixExpressions;

/**
 * Created by Mingyuan Li on 2015/12/1.
 * Package: EvaluatingPostfixExpressions
 * Project: Chapter3
 */
import java.util.*;

public class InfixToPostfix
{
    private Stack<Character> operatorStack;
    private static final String OPERATOR = "+-*/";
    private static final int[] PRECEDENCE = {1,1,2,2};
    private StringBuilder postfix;

    public static class SyntaxErrorException extends Exception
    {
        public SyntaxErrorException(String message)
        {
            super(message);
        }
    }
    public String convert(String infix) throws SyntaxErrorException
    {
        operatorStack = new Stack<Character>();
        postfix = new StringBuilder();
        String[] tokens = infix.split("\\s+");
        try
        {
            for (String token : tokens)
            {
                char firstChar = token.charAt(0);
                if (Character.isJavaIdentifierStart(firstChar) || Character.isDigit(firstChar))
                {
                    postfix.append(token);
                    postfix.append(' ');
                }
                else if (isOperator(firstChar))
                    processOperator(firstChar);
                else
                    throw new SyntaxErrorException("Invalid character: " + firstChar);
            }
            while (!operatorStack.empty())
            {
                char op = operatorStack.pop();
                postfix.append(op);
                postfix.append(' ');
            }
            return postfix.toString();
        }
        catch (SyntaxErrorException e)
        {
            throw new SyntaxErrorException("Stack is empty.");
        }
    }
    private void processOperator(char op)
    {
        if (operatorStack.empty())
            operatorStack.push(op);
        else
        {
            char topOp = operatorStack.peek();
            if (precedence(op) > precedence(topOp))
                operatorStack.push(op);
            else
            {
                while (!operatorStack.empty() && precedence(op) <= precedence(topOp))
                {
                    operatorStack.pop();
                    postfix.append(topOp);
                    postfix.append(' ');
                    if (!operatorStack.empty())
                        topOp = operatorStack.peek();
                }
                operatorStack.push(op);
            }
        }
    }
    private boolean isOperator(char ch)
    {
        return OPERATOR.indexOf(ch) != -1;
    }
    private int precedence(char ch)
    {
        return PRECEDENCE[OPERATOR.indexOf(ch)];
    }
}
