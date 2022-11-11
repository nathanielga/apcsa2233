package warmUps;
public class warmUp11112022
{
    public static void findMaximum(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+" is the greatest number.");
        }
        else if(b>a)
        {
            System.out.println(b+" is the greatest number.");
        }
        else
        {
            System.out.println("They are equal.");
        }

    }

    public static void main(String[] args)
    {
        findMaximum(5,6);
    }
}
