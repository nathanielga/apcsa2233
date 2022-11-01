package warmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp10272022
{
    public static void main(String[] args)
    {
        String[] arr = {"A","A","B","C","C"};
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> arr2 = new ArrayList<>();
        for(int i=0;i<arr1.size();i++)
        {
            arr2=arr1;
            int a = Integer.parseInt(arr2.get(i));
            arr2.remove(i);
            if(arr2.contains(a))
            {
                System.out.println("Value "+a+" is duplicated");
            }
            else
            {
                System.out.println("value "+a+"is not duplicated");
            }


        }
    }
}
