package warmUps;
public class warnUp1212022
{
    public static boolean ten10(int a, int b)
    {
            if(a==10||b==10||(a+b)==10)
            {
                return true;
            }
            else if (a==10&&b==10)
            {
                return false;
            }
            else
            {
                return false;
            }
    }
    public static void main(String[] args) {
        System.out.println(ten10(7,3));
    }
}
