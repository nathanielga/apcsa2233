package Lessons;

import java.util.Scanner;

public class Java10_SwitchStatements09082022
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);

       // Switch statement can be used in only limited cases, it is defined by an expression which can be string,
       // boolean or integer

        int h = 2;

        switch  (h)
        {

            case 1:
                System.out.println("It is number 1");
                break;
            case 2:
                System.out.println("It is number 2");
                break;
            case 3:
                System.out.println("It is number 3");
                break;
            default:
                System.out.println("default case");

        }








    }
}
