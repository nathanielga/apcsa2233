package warmUps;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
public class warmUp11082022
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Pear","Dragon fruit","Tomato"));
        int maxLengthFruit = fruits.get(0).length();
        int maxLengthFruitIterationNumber =0;
        for(int i=0; i<fruits.size();i++)
        {
            if(maxLengthFruit<fruits.get(i).length())
            {
                maxLengthFruit=fruits.get(i).length();
                maxLengthFruitIterationNumber=i;
            }
            if(i==fruits.size()-1)
            {
                System.out.printf("The longest fruit name is "+fruits.get(maxLengthFruitIterationNumber));
            }
        }
        System.out.println(maxLengthFruit);
    }
}
