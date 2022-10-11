package Lessons;

import java.util.Arrays;

public class Java15_Arrays10062022
{
    public static void main(String[] args)
    {
        // Arrays store more than one variable, but in the same type
        // array class is presented in java.utils
        // array size must be initialized
        // default value of string is null int is 0 boolean is false char is space

        int[] arr = {1,2,3,4,5,5,6,7,8,9}; //declaration of array
        String[] arr2 = {"Nathaniel","Alejandro","Trent","Chris"}; // declaration of string array
        char[] arr3 = new char[4]; // 4 is the size of the array declaration

        System.out.println(arr[1]);

        //assigning a value
        arr[0]=456; arr[1]=987; arr[2]=765;
        System.out.println(arr[0]);

        // printing each value of an array
        System.out.println(arr); // this will not print array values
        System.out.println(Arrays.toString(arr));

    }
}
