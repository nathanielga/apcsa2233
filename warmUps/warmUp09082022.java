package warmUps;

import java.util.Scanner;

public class warmUp09082022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if(n1==n2)
        {
            System.out.println("Number 1 and 2 are equal");
        }
        if(n2==n3)
        {
            System.out.println("Number 2 and 3 are equal");
        }
        if (n1==n3)
        {
            System.out.println("Number 1 and 3 are equal");
        }
        if(n1==n2)
        {
            if(n1==n3)
            {
                System.out.println("All numbers are equal");
            }
        }
        if(n1!=n2)
        {
           if(n1!=n3){
               System.out.println("None of the numbers are equal");
           }
        }

    }
}
