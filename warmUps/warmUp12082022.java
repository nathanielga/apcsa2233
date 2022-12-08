package warmUps;
public class warmUp12082022
{
    public static String firstLastExchange(String str)
    {
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        String newString = lastChar+str.substring(1,str.length()-1)+firstChar;
       return newString;
    }

    public static void main(String[] args) {
        System.out.println(firstLastExchange("Kristian"));
    }
}
