package UseOfSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: UseOfSet
 * Project: Chapter7
 */
public class UseOfSet
{
    public static void main(String[] args)
    {
        String[] listA = {"Ann", "Sally", "Jill", "Sally"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill"};
        Set<String> setA = new HashSet<String>();
        Set<String> setAcopy = new HashSet<String>();
        Set<String> setB = new HashSet<String>();

        for (String token : listA)
        {
            setA.add(token);
            setAcopy.add(token);
        }
        for (String token : listB)
        {
            setB.add(token);
        }
        System.out.println("The 2 set are: " + "\n" + setA + "\n" + setB);
        setA.addAll(setB);
        setAcopy.retainAll(setB);
        System.out.println("Items in set union are: " + setA);
        System.out.println("Items in set intersection are: " + setAcopy);
    }
}
