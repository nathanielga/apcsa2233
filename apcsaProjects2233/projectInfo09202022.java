package apcsaProjects2233;

import java.util.Scanner;

public class projectInfo09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String fName = scanner.nextLine();
        System.out.println("What is your last name?");
        String lName = scanner.nextLine();
        System.out.println("Are you currently employed?");
        String employment = scanner.nextLine();
        double salary;
        if(employment.equals("yes")|employment.equals("y"))
        {
            System.out.println("What is your salary?");
            salary = scanner.nextDouble();
            System.out.println("Full name: " + fName + " " + lName);
            System.out.println("Employed status: True");
            System.out.println("Salary: $" + salary);
        }
        else
        {
            System.out.println("Full name: " + fName + " " + lName);
            System.out.println("Employed status: False ");
            System.out.println("Salary: $" + 0);
        }









    }
}
