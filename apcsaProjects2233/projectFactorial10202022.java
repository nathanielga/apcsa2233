package apcsaProjects2233;

import java.util.Scanner;

public class projectFactorial10202022
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number to find the factorial of.");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int factorial =1;
        for(int i=1;i<=input;i++)
        {
            System.out.println(i);
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }
}
