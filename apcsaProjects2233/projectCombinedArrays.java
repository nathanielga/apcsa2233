package apcsaProjects2233;

import java.util.Arrays;

public class projectCombinedArrays
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int [] combined = new int[arr1.length+arr2.length];
        for(int i=0; i<arr1.length+arr2.length;i++)
        {
            combined[i]=arr1[i];

        }
        for(int i =3;i<6;i++)
        {
            int a = 0;
            combined[i]=arr2[a];
            a+
        }
        System.out.println(Arrays.toString(combined));

    }
}
