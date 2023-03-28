package CapstoneProjects;
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int max=100;
        int min=0;
        int numGuess=0;
        int num = rand.nextInt(0,100);
        Scanner scanner = new Scanner(System.in);
        boolean numEquals=true;

        while(numEquals=true)
        {
            System.out.println("Enter your guess");
            numGuess= scanner.nextInt();
            if(num==numGuess)
            {
                System.out.println("Congrats you are correct!");
                numEquals=false;
               System.exit(0);
            }
            else if(num<numGuess)
            {
                System.out.println("The number is lower, try again");
                numEquals=true;
            }
            else if(num>numGuess)
            {
                System.out.println("The number is higher, try again");
                numEquals=true;
            }
        }

    }
}
