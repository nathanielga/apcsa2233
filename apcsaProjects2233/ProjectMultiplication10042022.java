package apcsaProjects2233;

import java.util.Scanner;

public class ProjectMultiplication10042022
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number and i'll give you the multiplication table");
        int num = scanner.nextInt();

        for(int i = 1 ; i<=num ; i++){
            System.out.println(i*num);
        }
    }
}
