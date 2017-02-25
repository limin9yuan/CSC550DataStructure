package DoubleLinkedListUseIterator;

/**
 * Created by Victor on 11/19/2015.
 * Package: DoubleLinkedListUseIterator
 * Project: Chapter2
 */
public class DoubleListDriver
{
    public static void main(String[] args)
    {
        DoubleLinkedList<String> people = new DoubleLinkedList<String>();
        people.addLast("Amy");
        people.addLast("Jack");
        people.addLast("John");
        people.addLast("Jason");
        System.out.println(people.toString());
        people.remove("Amy");
        System.out.println(people.toString());
        people.remove(2);
        System.out.println(people.toString());
        people.addFirst("Peter");
        System.out.println(people.toString());
        people.addLast("Neo");
        System.out.println(people.toString());
        people.set(1, "Frank");
        System.out.println(people.toString());
        DoubleLinkedList<String> people2 = new DoubleLinkedList<String>(people);
        System.out.println(people2.toString());
        if (people.equals(people2))
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println(people.getFirst());
        System.out.println(people.getLast());

    }

}
