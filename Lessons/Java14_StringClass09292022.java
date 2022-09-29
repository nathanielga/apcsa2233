package Lessons;

public class Java14_StringClass09292022
{
    public static void main(String[] args)
    {
        // Declaration of a string
        // there are two ways to create a string 1 with double quote 2nd with a new keyword

        String string1 = "Hello World";
        String string2 = new String("Hello World 2");

        // Strings are immutable
        // when you create a string it means unmodifiable or unchangeable.



        // STRING POOL
        // in java corresponds to an allocation of memory in java heap memory
        // it is a collection of String objects

        // strings are represented with sequence of characters. (with index numbers)

        String str= "Nathaniel";

        // STRING MANIPULATION METHODS

        // str.charAT(IndexNumber();

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));

    // LENGTH
        // This helps us to get the length of a string

        System.out.println(str.length());


        System.out.println(str.substring(0,3));

    }
}
