package warmUps;
public class warmUp12092022
{
    public static String addFirstTwoLettersToEnd(String str)
    {
        if (str.length() >= 2)
        {
            String firstTwoLetters = str.substring(0, 2);
            str = str + firstTwoLetters;
        }
        return str;
    }
    public static void main(String[] args)
    {
        addFirstTwoLettersToEnd("Nathaniel");
    }
}