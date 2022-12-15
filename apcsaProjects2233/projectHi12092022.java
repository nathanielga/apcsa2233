package apcsaProjects2233;
public class projectHi12092022
{
    public static boolean startsWithHi(String str)
    {
        // Check if the string starts with "hi"
        if (str.startsWith("hi"))
        {
            return true;
        }
        else if(str.length()<2)
        {
            return false;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        startsWithHi("High");
    }
}