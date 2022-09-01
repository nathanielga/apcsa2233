package warmUps;

import java.util.Scanner;

public class warmUp09012022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many gallons do you need to convert?");
        double gallons = scanner.nextDouble();
        System.out.println(gallons  + " gallons is " + (gallons * 3.785) + " liters" );




    }
}
