package apcsaProjects2233;

public class projectPalindrome
{
    public static void main(String[] args)
    {
        String str = "radar";
        boolean b1 = true;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                b1=false;
            }
            if(b1=true)
            {
                b1=true;
            }
        }
        System.out.println("b1");
    }
}
