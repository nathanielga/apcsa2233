package apcsaProjects2233;

import org.w3c.dom.ls.LSOutput;

public class projectSumoTwoValues
{
    public static int sumOfSame(int num1,int num2)
    {
        if(num1==num2)
        {
            return (int) Math.pow(num1,num2);
        }
        else if(num1!=num2)
        {
            return num1+num2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSame(6,6));
    }
}
