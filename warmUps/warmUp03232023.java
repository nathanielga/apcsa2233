package warmUps;
import java.util.Scanner;
public class warmUp03232023
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter num 1");
        int a=scanner.nextInt();
        System.out.println("Enter num 2");
        int b=scanner.nextInt();
        int sum = a+b;
        if(sum<10|sum>19)
        {
            System.out.println(sum);
        }
        else if(sum>=10||sum<=19)
        {
            System.out.println(20);
        }
    }
}
