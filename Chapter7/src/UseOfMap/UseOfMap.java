package UseOfMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mingyuan Li on 2015/12/4.
 * Package: UseOfMap
 * Project: Chapter7
 */
public class UseOfMap
{
    public static void main(String[] args)
    {
        Map<String, String> nameMap = new HashMap<String, String>();
        nameMap.put("J", "Jane");
        nameMap.put("B", "Bill");
        nameMap.put("S", "Sam");
        nameMap.put("B1", "Bob");
        nameMap.put("B2", "Bill");
        System.out.println(nameMap.toString());
        if (nameMap.isEmpty())
            System.out.println("Map is empty.");
        else
            System.out.println("Map is not empty.");
        System.out.println(nameMap.size());
        System.out.println("B1 maps to " + nameMap.get("B1"));
        System.out.println("Jane maps to " + nameMap.get("Jane"));
        System.out.println(nameMap.remove("B2"));
        System.out.println(nameMap);
    }
}
