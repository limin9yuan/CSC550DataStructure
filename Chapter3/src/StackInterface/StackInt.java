package StackInterface;

/**
 * Created by Victor on 11/23/2015.
 * Package: StackInterface
 * Project: Chapter3
 */
public interface StackInt<E>
{
    E push(E obj);
    E peek();
    E pop();
    boolean empty();
}
