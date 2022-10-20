package apcsaProjects2233;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class project5to5510202022
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,5,6,5,6,5,6,8,9,0,10));
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==5)
            {
                Collections.replaceAll(list,5,55);
            }
        }
        System.out.println(list);


    }
}
