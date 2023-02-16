package warmUps;
public class warmUp02162023
{

    public static String firstHalf(String str)
    {
        int half = str.length()/2;
        return str.substring(0,half);
    }

    public static void main(String[] args)
    {
        System.out.println(firstHalf("WooHoo"));
    }
}
