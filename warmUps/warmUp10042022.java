package warmUps;

import java.util.Scanner;

public class warmUp10042022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String fN = scanner.next();
        String lN = scanner.next();
        System.out.println("Your initials are "+fN.charAt(0)+lN.charAt(0));
    }
}
