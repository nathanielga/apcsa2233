package apcsaProjects2233;

import java.util.Scanner;

public class projectMonthConverter09152022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter what month you want to find the days of.");
        String month = scanner.nextLine();

        if(month.equals("January")||month.equals("March")||month.equals("May")||month.equals("July")||month.equals("August")
        ||month.equals("October")||month.equals("December"))


        {
            System.out.println("There is 31 days in " + month);
        }

        if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November")
    ||     month.equals("4")||month.equals("6")||month.equals("9")||month.equals("11"))
        {
            System.out.println("There is 31 days in " + month);
        }









    }
}
