package apcsaProjects2233;

import java.util.Scanner;

public class projectCalculator09022022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What operator would you like to use");
        String operator = scanner.nextLine();
        System.out.println("Enter the first number you would like to calculate");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number you would like to calculate");
        int number2 = scanner.nextInt();

        if(operator.equals("+"))
        {
            System.out.println(number2 + number1);
        }

        if(operator.equals("-"))
        {
            System.out.println(number1 - number2);
        }
        if(operator.equals("*"))
        {
            System.out.println(number1 * number2);
        }
        if(operator.equals("/"))
        {
            System.out.println(number1 / number2);
        }
        else
        {
            System.out.println("Enter a valid operator");
        }


    }
}
