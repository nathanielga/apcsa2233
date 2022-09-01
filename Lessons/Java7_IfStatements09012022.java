package Lessons;

import java.util.Scanner;

public class Java7_IfStatements09012022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
                    LOGICAL STATEMENTS

              The if statement evaluates a condition. If the condition evaluates to true, any statements in the
              subsequent code block are executed.

              KEYWORD     CONDITION
              if          (5>7)
              {
                          OUTPUT COMMAND TO EXECUTE IF THE CONDITION IS TRUE
              }
              else
              {

                          OUTPUT COMMAND IF CONDITION IS NOT TRUE
              }

         */
/*
System.out.println("How old are you?");
        double age = scanner.nextDouble();
        if (age >= 18){
            System.out.println("You are eligible to vote");

        }
        else if (age <18){
            System.out.println("You are not eligible to vote");
        }
 */
     /*

        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int number3 = scanner.nextInt();

        if(number1>number2){
            if(number1>number3);
            System.out.println("The greatest number is " + number1);


            }

        if(number2>number3){
            if(number2>number1);
            System.out.println("The greatest number is " + number2);


        }

        if(number3>number2)
        {
            if(number3>number1)
            {
                System.out.println("The greatest number is " + number3);
            }

        }

      */


     //   System.out.println("Enter the first number");
     //   int number1 = scanner.nextInt();
     //   System.out.println("Enter the second number");
     //   int number2 = scanner.nextInt();
     //    if (number2 == number1)
     //    {
     //        System.out.println("The numbers are equal to each other");

     //    }
     //    else{
     //        System.out.println("The numbers are not equal to each other");
     //    }
    /*
        System.out.println("What is the current time in military time?");
        int time = scanner.nextInt();

        if(time < 12 ){
            System.out.println("Good Morning");
        }
        if (time > 12 && time < 15){
                System.out.println("Good Afternoon");
            }
        if(time > 15){
            System.out.println("Good evening");
        }

        // NESTED IF STATEMENTS

        // if statements within if statements
*/
    //    boolean isWeekday;
    //    boolean isSunny ;
//
    //    if(isWeekday=true)
    //    {
    //        if(isSunny=true){
    //            System.out.println("picnic");
    //        }
    //        else{
    //            System.out.println("TV");
    //        }
    //    }
     //   else
    //    {
    //        System.out.println("School");
     //   }

        System.out.println("Enter a number");
        int positiveOrNegative = scanner.nextInt();


        if(positiveOrNegative>0){
            System.out.println("The number is positive");

        }
        else if(positiveOrNegative==0){
            System.out.println("The number is 0");
        }

        else if(positiveOrNegative<0){
            System.out.println("The number is negative");
        }







        }







    }

