package apcsaProjects2233;

import java.util.Scanner;

public class ProjectReverseString10042022
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = "Java";
        String reversedSTR="";

        for(int i=0;i<str.length();i++)
        {
            reversedSTR+=str.charAt(str.length()-i-1);

        }
        System.out.println(reversedSTR);

    }
}
