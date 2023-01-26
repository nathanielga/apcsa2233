package warmUps;
public class warmUp01192023
{
    public static String front3repeat(String str)
    {
        String first3 = str.substring(0,3);
        return first3+first3;
    }
    public static void main(String[] args)
    {
        System.out.println(front3repeat("Chocolate"));
    }
}
