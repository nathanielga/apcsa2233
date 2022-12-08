package apcsaProjects2233;

import java.util.Locale;

public class projectCapLow12082022
{
    public static String capLow(String str)
    {
        String newString = "";
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0)
            {
                char c = str.charAt(i);
                String d = Character.toString(c);
                newString+=d.toUpperCase();
            }
            else
            {
                char e = str.charAt(i);
                String f = Character.toString(e);
                newString+=f.toLowerCase();
            }
        }
        return newString;
    }

    public static void main(String[] args)
    {
        System.out.println(capLow("Nathaniel"));
    }
}
