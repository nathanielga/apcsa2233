package warmUps;

public class warmUp01032023
{
    public static int  near10(int a, int b)
        {
            if((a+b)/2==10)
            {
                return 0;
            }
            else if (a-10<b-10)
            {
                return a;
            }
           else if(b-10<a-10)
            {
                return b;
            }
           return a;
}

    public static void main(String[] args)
    {
        System.out.println(near10(10,10));
    }
}
