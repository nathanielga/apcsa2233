package Lessons;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Java5_Scanners
{
    public static void main(String[] args)
    {

        /* SCANNER CLASS

        The scanner class is used to get input from the user.
        but we need to import java.util.Scanner

        DECLARATION

        Scanner scanner = new Scanner(System.in);
         */

        Scanner scanner = new Scanner(System.in);

       // System.out.println("Please enter your name ");
       // String name = scanner.nextLine();
        //System.out.println("Your name is " + name);
       // System.out.println("How old are you?");
       // String age = scanner.nextLine();
        //System.out.println("You are " + age + " years old");
        //System.out.println("Where are you from?");
        //String location = scanner.nextLine();
        //System.out.println("You are located at " + location);
        //System.out.println("Your name is " + name + ", you are " + age + " years old" + " and you are from " + location + ".");


        System.out.println("What is your first name?");
        String name = scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();
        System.out.println("What is your student ID number?");
        String idNumber = scanner.nextLine();
        System.out.println("What is the name of your school?");
        String schoolName = scanner.nextLine();
        System.out.println("Your name is " + name +" " +lastName + ", you go to " + schoolName + " and your student ID number is " + idNumber +  ".");


    }
}
