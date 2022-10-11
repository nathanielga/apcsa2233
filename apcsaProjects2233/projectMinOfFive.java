package apcsaProjects2233;

import java.util.Arrays;
import java.util.Scanner;

public class projectMinOfFive
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int[] myIntArray = {num1,num2,num3,num4,num5};

        System.out.println(Arrays.stream(myIntArray).min());

    }
}
