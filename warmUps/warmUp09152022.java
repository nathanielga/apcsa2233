package warmUps;

import java.util.Scanner;

public class warmUp09152022
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

        System.out.println("What day of the week is it?");
        int day = scanner.nextInt();

        if(day==1)
        {
            System.out.println("Today is Monday");
        }
        else if(day==2)
        {
            System.out.println("Today is Tuesday");
        }
        else if(day==3)
        {
            System.out.println("Today Wednesday");
        }
        else if(day==4)
        {
            System.out.println("Today is Thursday");
        }
        else if(day==5)
        {
            System.out.println("Today is Friday!");
        }

        else if(day==6)
        {
            System.out.println("Today is Saturday!");
        }

        else if(day==7)
        {
            System.out.println("Today is Sunday");
        }

        else if(day>7||day<1)
        {
            System.out.println("This day is not in the week");
        }
    }
}
