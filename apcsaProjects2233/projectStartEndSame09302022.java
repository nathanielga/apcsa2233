package apcsaProjects2233;

import java.util.Scanner;

public class projectStartEndSame09302022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();
        int length = word.length();
        if(word.charAt(0)==word.charAt(length-1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
