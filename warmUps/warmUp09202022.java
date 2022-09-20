package warmUps;

import java.util.Scanner;

public class warmUp09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your yearly salary");
        double salary = scanner.nextInt();
        System.out.println("How many hours do you work in a week?");
        double hours = scanner.nextInt();

        System.out.println("Your hourly salary rate is " + (salary/52)/hours);
    }
}
