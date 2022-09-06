package apcsaProjects2233;

import java.util.Scanner;

public class projectSalary09062022
{
    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your yearly salary");
            double salary = scanner.nextInt();

            if(salary<30000)
            {
                System.out.println("You must earn at least 30000");
            }
            // setting the minimum salary
            else if(salary>=30000)
            {
                System.out.println("How many years have you been working at this job?");
                double yearsAtJob = scanner.nextDouble();
                // setting the minimum for how many years they have worked at their job
                if(yearsAtJob<2)
                {
                    System.out.println("You must have been working at your job for at least 2 years");

                }
                if(yearsAtJob>=2)
                {
                    System.out.println("You are eligible for the loan");
                }
            }




        }
    }