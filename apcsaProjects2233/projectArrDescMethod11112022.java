package apcsaProjects2233;

import java.util.Arrays;
import java.util.Collections;

public class projectArrDescMethod11112022
{
    public static void descendingArray(int[] arr)
    {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
        descendingArray(arr2);
    }
}
