package warmUps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class warmUp11012022
{
    public static void main(String[] args)
    {
        // write a program that sort the array in descending order
        String[] arr = new String[4];
        arr[0]="Kris";
        arr[1]="Alex";
        arr[2]="Trent";
        arr[3]="Ethan";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);
        System.out.println(list);
    }
}
