package apcsaProjects2233;

import java.util.Scanner;

public class ProjectCheckWords09302022
{
    public static void main(String[] args)
    {
        System.out.println("Enter three words");
        Scanner scanner = new Scanner(System.in);
        String wrd1 = scanner.next();
        String wrd2 = scanner.next();
        String wrd3 = scanner.next();
        int wrd1Length = wrd1.length();
        int wrd2Length = wrd2.length();
        int wrd3Length = wrd3.length();

        if(wrd1Length==wrd2Length&&wrd1Length==wrd3Length)
        {
            System.out.println("All words are the same length");
        }

        if(((wrd1Length==wrd2Length)&&(wrd1Length!=wrd3Length))||(wrd2Length==wrd3Length&&(wrd2Length!=wrd1Length))||wrd3Length==wrd1Length&&(wrd3Length!=wrd2Length))
        {
            System.out.println("Not same or different lengths");
        }

        if((wrd1Length!=wrd2Length)&&wrd1Length!=wrd3Length)
        {
            System.out.println("None of them are equal");
        }





    }
}