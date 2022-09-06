package apcsaProjects2233;

import java.util.Scanner;

public class projectGrades09062022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three number grades of Math, ELA, and APCSA");
        int math = scanner.nextInt();
        int ela = scanner.nextInt();
        int apcsa = scanner.nextInt();
        int average = ((math+ela+apcsa)/3);

        if(average >= 90 && average <= 100)
        {
            System.out.println("Your average grade is A");
        }
        else if(average >= 80 && average <= 89)
        {
            System.out.println("Your average grade is B");
        }
        else if (average >= 70 && average <= 79)
        {
            System.out.println("Your average grade is a C");
        }
        else if(average >= 60 && average <= 69)
        {
            System.out.println("Your average grade is D");
        }
        else if(average >= 50 && average <= 59)
        {
            System.out.println("Your average grade is F");
        }





    }
}
