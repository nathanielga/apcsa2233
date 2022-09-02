package Lessons;

public class Java8_NestedIfStatements
{
    public static void main(String[] args)
    {
        /*
        syntax

        if(condition1)
        {
               statement;
        }

        else if(condition2)
        {
           statement2;
          }
          else if(condition3){
          (statement)

          {




         */

        int a = 2;

        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

        int firstAngle = 60;
        int secondAngle = 60;
        int thirdAngle = 60;

        if(firstAngle + secondAngle + thirdAngle == 180)
        {
            System.out.println("The triangle is valid");
        }
        else
        {
            System.out.println("the triangle is not valid");
        }

        










    }
}
