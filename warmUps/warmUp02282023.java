package warmUps;

public class warmUp02282023
{
    public static String nonStart(String str1, String str2)
    {
        str1.replace(str1.charAt(0),' ');
        str2.replace(str2.charAt(0),' ');
        return str1+str2;
    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello","There"));
    }
}
