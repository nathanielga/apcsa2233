package Lessons;

import java.util.Collections;

public class Java20_Methods
{
        // grouping a series of statements together to preform specific tasks like functions
        // methods can make our codes reusable, you do not need to repeat same set of statements
        // without main method you can not run any java application
        // you can not create a method within a method
        // methods must be created/declared within a class
        // we call the methods by their name
        // void method does not return any value
        // you can not create 2 main methods within same class
        // you can not create a main method within a main method
        // but you can call one method within another method
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// METHOD DECLARATION
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Public               Static                 void        main               (String[] args)              {}
// ---------------------------------------------------------------------------------------------------------------------
// access               specifier               return     method                arguments               method
// modifier                                     type       name                                           body
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// VOID METHODS WITHOUT PARAMETERS
        public static void myFirstMethod()
        {
            System.out.println("Hello World");
            System.out.println("How are you doing today");
            System.out.println("Trent is a good student");
            System.out.println("They say he is not");
        }
        public static void oneToHundred()
        {
          for(int i=0;i<=100;i++)
          {
              System.out.println(i);
          }
        }
        public static void evenOrOdd(int a)
        {
           if(a%2==0)
           {
               System.out.println("even");
           }
           else
           {
               System.out.println("odd");
           }
        }
      public static void sumOfTwo(int a,int b)
      {
          System.out.println("The sum of the numbers is:    "+(a+b));
      }
//      public static void removeDuplicates(String str)
 //     {
 //         String result ="";
 //         for(int i=0;i<=str.length();i++)
 //         {
 //               if(!result.contains(String.valueOf(str.charAt(i))))
  //              {
  //                  result+=str.substring(i,i+1);
  //              }
  //            System.out.println(result);
  //        }
 //     }

      public static void kmtoml(double d)
      {
          System.out.println(d*0.620934);
      }
      public static void mltokm(double d)
      {
          System.out.println(d*1.60934);
      }




    public static void main(String[] args)
    {
        myFirstMethod();
        oneToHundred();
        evenOrOdd(10);
        sumOfTwo(7,8);
        mltokm(60);
        kmtoml(100);

    }




}
