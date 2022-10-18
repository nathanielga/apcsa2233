package warmUps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class warmUp10182022
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Kristian", "Christopher", "Alex", "Trent", "Muammer", "Sebastian", "Ethan", "Nathaniel"));
        System.out.println(names);
        names.sort(Comparator.naturalOrder());
        System.out.println(names);


    }
}
