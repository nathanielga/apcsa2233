package apcsaProjects2233;

import java.util.Scanner;

public class projectSumOfGivenNumbers09272022
{
        public static void main(String[] args)
        {
            System.out.println("Enter a number you want to find the sum off all of the numbers leading up to it");
            Scanner scanner = new Scanner(System.in);
            int max = scanner.nextInt();
            int sum = 0;
            for(int i=0;i<max;i++)
            {
                sum= sum+i;

            }
            System.out.println("The sum of all the numbers leading up to "+"max is "+sum);



        }
    }
