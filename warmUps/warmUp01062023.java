package warmUps;

public class warmUp01062023
{
    public static String startEndUpper(String str)
    {
        String firstLetterCapitalized = str.substring(0,1).toUpperCase();

        String lastLetterCpaitalized = str.substring(str.length()-1,str.length()).toUpperCase();

        String lettersInTheMiddle = str.substring(1,str.length()-1).toLowerCase();

        return firstLetterCapitalized+lettersInTheMiddle+lastLetterCpaitalized;
    }

    public static void main(String[] args) {
        System.out.println(startEndUpper("Hello"));
    }

}
