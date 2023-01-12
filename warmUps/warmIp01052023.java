package warmUps;

public class warmIp01052023
{
    public static boolean lastD(int a, int b)
    {
        if(a%10==b%10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(lastD(13,21));
    }
}
