package Lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

public class Java18_ArraysVSArrayLists10182022
{
    public static void main(String[] args)
    {
        // manually turn the following array to arraylist
        int[] arr = {111,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<arr.length ; i++)
        {
            list.add(arr[i]);
        }
        System.out.println(list);
        Collections.sort(list);

    }
}
