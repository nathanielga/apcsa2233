package warmUps;

import java.util.Scanner;

public class warmUp10132022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number you want to calculate.");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number you want to calculate");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operator you would like to use.");
        String operator = scanner.next();
        if(operator.equals("+"))
        {
            System.out.println(num1+" plus "+num2+" is "+(num1+num1));
        }
        else if(operator.equals("-"))
        {
            System.out.println(num1+" minus "+num2+" is "+(num1-num2));
        }
        else if(operator.equals("*"))
        {
            System.out.println(num1+" times "+num2+" is "+(num1*num2));
        }
        else if(operator.equals("/"))
        {
            System.out.println(num1+" divided by "+num2+" is "+(num1/num2));
        }
        else
        {
            System.out.println("Invalid Operator");
        }
        System.out.println("Would you like to calculate another equation?");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("Y"))
        {

        }
        else if(answer.equalsIgnoreCase("N"))
        {

        }


    }
}
