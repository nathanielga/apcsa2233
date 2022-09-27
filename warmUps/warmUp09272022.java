package warmUps;

public class warmUp09272022
{
    public static void main(String[] args)
    {
        for(int i=0;i<100;i++)
        {
            if(i%2==1)
            {
                if(i%3==0&&i%5==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
