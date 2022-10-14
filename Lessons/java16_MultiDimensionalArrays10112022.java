package Lessons;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class java16_MultiDimensionalArrays10112022
{
    public static void main(String[] args)
    {
        // MULTI DIMENSIONAL ARRAYS
        // contains multiple (n-1) single dimensional arrays

        // DECLARATION OF TWO DIMENSIONAL ARRAYS
 //       int[] arr = {3,6,8}; // one dimensional array
 //       int[][] arr2d = {{3,6,8},{332,116,338}};

        // PRINT SPECIFIC VALUES
 /*
 System.out.println(arr2d[0][0]);
        System.out.println(arr2d[0][1]);
        System.out.println(arr2d[0][2]);
        System.out.println(arr2d[1][0]);
        System.out.println(arr2d[1][1]);
        System.out.println(arr2d[1][2]);]
        int[][][] arr3d = {{{1,2,3},{4,5,6}},   {{7,8,9},{11,22,33}},     {{12,22,33},{14,25,36}}};
        System.out.println(arr3d[2][0][2]);


        // PRINTING ARRAYS DEEP TO STRING METHOD
        System.out.println(Arrays.deepToString(arr3d));
  */


        int[] arr4=new int[51];
        for(int i = 0, a=0;i<100 ; i+=2,a++)
        {
            arr4[4]=i;
        }

        System.out.println(arr4);




    }
}
