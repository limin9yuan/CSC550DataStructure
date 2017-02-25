package SingleLinkedList;

/**
 * Created by Victor on 11/19/2015.
 * Package: SingleLinkedList
 * Project: Chapter2
 */
public class SingleListDriver
{
    public static void main(String[] args)
    {
        SingleLinkedList<String> people = new SingleLinkedList<String>();
        people.add("Amy");
        people.add("John");
        people.add("Peter");
        System.out.println(people.toString());
        people.add(0, "neo");
        people.add(1,"Jason");
        System.out.println(people.toString());
        people.remove(0);
        people.remove("Jason");
        System.out.println(people.toString());
        System.out.println(people.get(2));
        people.set(2,"neo");
        System.out.println(people.toString());
        SingleLinkedList<String> people1 = new SingleLinkedList<String>(people);
        if (people.equals(people1))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
