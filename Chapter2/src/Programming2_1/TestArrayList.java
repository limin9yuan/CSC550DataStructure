package Programming2_1;

import java.util.ArrayList;

public class TestArrayList<E>
{
    public static void replace(ArrayList<String> aList, String oldItem, String newItem)
    {
        int index = aList.indexOf(oldItem);
        if (index != -1)
            aList.set(index, newItem);
        else
            aList.add(newItem);
    }
    public static void delete(ArrayList<String> aList, String target)
    {
        int index = aList.indexOf(target);
        if (index != -1)
            aList.remove(target);
        else
            System.out.println(target + " is not found.");
    }


}
