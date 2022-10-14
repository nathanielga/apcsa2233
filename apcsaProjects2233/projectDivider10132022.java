package apcsaProjects2233;

import java.util.Scanner;

public class projectDivider10132022
{
        public static int divide(int x, int y)
        {
            if (y == 0)
            {
                System.out.printf("Error!! Divisible by 0");
                System.exit(-1);
            }
            int sign = 1;
            if (x * y < 0) {
                sign = -1;
            }
            x = Math.abs(x);
            y = Math.abs(y);
            int quotient = 0;
            while (x >= y)
            {
                x = x - y;
                quotient++;
            }
            System.out.println("The remainder is " + x);
            return sign * quotient;
        }
        public static void main(String[] args)
        {
            System.out.println("Enter your dividend");
            Scanner scanner = new Scanner(System.in);
            int dividend = scanner.nextInt();
            System.out.println("Enter your divisor");
            int divisor = scanner.nextInt();

            System.out.println("The quotient is " + divide(dividend, divisor));
        }
    }
