package Lessons;
public class Java21_ReturnMethods11152022
{
    // these methods can use any types of data, primitive or non-primitive
    // odes not have void as a return type
    // must return a value
    // the returning value must match with the return type of the method
    //  must be closed with return
    public static int averageOfThree(int a, int b, int c)
    {
        return ((a+b+c)/2);
    }
    public static void main(String[] args)
    {
        System.out.println(averageOfThree(4,5,6));
    }
}
