package apcsaProjects2233;
import java.util.Arrays;
public class projectSameIndexArray10272022
{
    public static void main(String[] args)
    {
        int[] numbers = new int[100];
        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i]=i;
        }
        System.out.println(Arrays.toString(numbers));
        for(int i = 0; i<numbers.length; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
