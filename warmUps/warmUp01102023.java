package warmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class warmUp01102023
{
    public static ArrayList<Integer> uniqueListMethod(ArrayList<Integer> myList)
    {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int i=0;i<myList.size();i++)
        {
            if(uniqueList.contains(myList.get(i)))
            {
                    uniqueList.add(myList.get(i));
            }
        }
        return uniqueList;

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> asdf= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,6)) ;
        System.out.println(uniqueListMethod(asdf));
    }

}


