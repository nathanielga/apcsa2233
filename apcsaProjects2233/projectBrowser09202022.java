package apcsaProjects2233;

import java.util.Scanner;

public class projectBrowser09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String browserName;

        System.out.println("Enter which browser you use");
        browserName = scanner.nextLine();

        if(browserName.equalsIgnoreCase("Chrome")||browserName.equals("Firefox")
        ||browserName.equalsIgnoreCase("Opera")||browserName.equalsIgnoreCase("Safari"))
        {
            System.out.println("Valid browser name");
        }
        else
        {
            System.out.println("Invalid browser name");
        }


    }
}
