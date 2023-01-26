package warmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp0122023
{
    public static boolean front4check9(ArrayList<Integer> arr)
    {
        for(int i=0;i<4;i++)
        {
            if(arr.get(i)==9)
            {
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,9,5));
        System.out.println(front4check9(myList));
    }

}
