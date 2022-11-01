package warmUps;
public class warmUp10282022
{
    public static void main(String[] args)
    {
        int minimum = 0;
        int max = 100;
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < max; i++)
        {
            if (i % 2 == 0)
            {
                counterEven++;
            }
            else
            {
                counterOdd++;
            }
        }
        System.out.println("There is "+counterEven+" even numbers");
        System.out.println("There is "+counterOdd+" odd numbers");

    }
}
