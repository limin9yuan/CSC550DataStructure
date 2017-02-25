package Programming1_1;

/**
 * Created by mingyuanli on 15/11/13.
 */
public class Person
{
    private String lastName;
    private String firstName;

    public int compareTo(Person per)
    {
        if (lastName.equals(per.lastName))
            return firstName.compareTo(per.firstName);
        else
            return lastName.compareTo(per.lastName);
    }
    public void changeLastName(boolean justMarried, String newLastName)
    {
        if (justMarried)
            lastName = newLastName;
    }
}
