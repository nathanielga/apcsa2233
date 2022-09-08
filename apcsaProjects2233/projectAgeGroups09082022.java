package apcsaProjects2233;

import java.util.Scanner;

public class projectAgeGroups09082022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age in years");
        double age = scanner.nextDouble();

        if(age<0&&age<2)
        {
            System.out.println("You are an infant");
        }
        if(age>=3&&age<=5)
        {
            System.out.println("You are a toddler");
        }
        if(age>=6&&age<=9)
        {
            System.out.println("You are a kid");
        }
        if(age>=10&&age<=12)
        {
            System.out.println("You are a pre teen");
        }
        if(age>=13&&age<=17)
        {
            System.out.println("You are a teenager");
        }
        if(age>=18&&age<=20)
        {
            System.out.println("You are a young adult");
        }
        if(age>=21&&age<=39)
        {
            System.out.println("You are an adult");
        }
        if(age>=40&&age<=49)
        {
            System.out.println("You are a young middle aged adult");
        }
        if(age>=50&&age<=54)
        {
            System.out.println("You are a middle aged adult");
        }
        if(age>=55&&age<=64)
        {
            System.out.println("You are a very young senior citizen");
        }
        if(age>=65&&age<=74)
        {
            System.out.println("You are a young senior citizen");
        }
        if(age>=75&&age<=84)
        {
            System.out.println("You are a Senior Citizen");
        }
        if(age>=85&&age<=120)
        {
            System.out.println("You are an old senior citizen");
        }
        if(age>=120)
        {
            System.out.println("You are no longer alive");
        }
        if(age<0)
        {
            System.out.println("You are not born yet");
        }



    }
}
