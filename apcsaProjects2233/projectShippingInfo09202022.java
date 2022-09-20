package apcsaProjects2233;

import java.util.Scanner;

public class projectShippingInfo09202022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();
        System.out.println("Enter your street address");
        String address = scanner.nextLine();
        System.out.println("Enter your city name");
        String city = scanner.nextLine();
        System.out.println("Enter your state abbreviation");
        String state = scanner.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        System.out.println("Ship to:   "+fullName);
        System.out.println("                  "+address);
        System.out.println("                  "+city+", "+state+" "+zipCode);
    }
}
