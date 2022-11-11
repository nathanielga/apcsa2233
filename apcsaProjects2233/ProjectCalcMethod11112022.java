package apcsaProjects2233;
public class ProjectCalcMethod11112022
{
    public static void calculator(double a,String operator, double b)
    {
        if(operator.equalsIgnoreCase("+"))
        {
            System.out.println(a+b);
        }
        else if (operator.equalsIgnoreCase("-"))
        {
            System.out.println(a-b);
        }
        else if (operator.equalsIgnoreCase("*"))
        {
            System.out.println(a*b);
        }
        else if (operator.equalsIgnoreCase("/"))
        {
            System.out.println(a/b);
        }
        else if (operator.equalsIgnoreCase("^"))
        {
            System.out.println(Math.pow(a, b));
        }

    }

    public static void main(String[] args)
    {
        calculator(1,"+",1);
    }
}
