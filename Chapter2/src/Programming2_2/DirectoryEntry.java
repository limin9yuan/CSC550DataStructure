package Programming2_2;

import java.util.ArrayList;
/**
 * Created by Victor on 2015/11/13.
 * Chapter2
 */
public class DirectoryEntry
{
    private String name;
    private String number;
    private ArrayList<DirectoryEntry> theDirectory = new ArrayList<DirectoryEntry>();

    public DirectoryEntry()
    {
        name = "";
        number = "";
    }
    public DirectoryEntry(String name, String number)
    {
        this.name = name;
        this.number = number;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getNumber()
    {
        return number;
    }
    public String addOrChangeEntry(String name, String number)
    {
        int index = 0;
        while (!theDirectory.get(index).getName().equals(name))
        {
            index++;
        }
        if (index < theDirectory.size())
        {
            String oldNumber = theDirectory.get(index).getNumber();
            theDirectory.get(index).setNumber(number);
            return oldNumber;
        }
        else
        {
            theDirectory.add(new DirectoryEntry(name, number));
            return null;
        }
    }
    public DirectoryEntry removeEntry(String name)
    {
        int index = 0;
        while (!theDirectory.get(index).getName().equals(name))
        {
            index++;
        }
        if (index < theDirectory.size())
        {
            DirectoryEntry returnValue = theDirectory.remove(index);
            return returnValue;
        }
        else
            return null;
    }
}
