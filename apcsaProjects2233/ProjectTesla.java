package apcsaProjects2233;


import java.util.Scanner;

public class ProjectTesla
{
    public static void main(String[] args)
    {
        int price;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What model tesla do you want? (Model S,Model 3,Model X, Model Y)");
        String model = scanner.nextLine();
        if(model.equalsIgnoreCase("Model S"))
        {
            price= 94990;
            System.out.println("Do you want it plaid?");
            if(scanner.nextLine().equalsIgnoreCase("Yes"))
            {
                price=+20000;
            }
            System.out.println("What color would you like? (White, Black, Silver, Blue, Red");
            String color = scanner.nextLine();
            if(color.equalsIgnoreCase("White"))
            {
                price=price+0;
            }
            else if(color.equalsIgnoreCase("Black"))
            {
                price=+1500;
            }
            else if(color.equalsIgnoreCase("Silver"))
            {
                price+=1500;
            }
            else if(color.equalsIgnoreCase("Blue"))
            {
                price+=1500;
            }
            else if(color.equalsIgnoreCase("Red"))
            {
                price+=2500;
            }
            else
            {
                System.out.println("Enter a valid Color");
            }
            System.out.println("What size wheels? (19in , 21in)");
            int wheelSize = scanner.nextInt();
            if(wheelSize==19)
            {
                price+=0;
            }
            else if(wheelSize==21)
            {
                price+=4500;
            }
            else
            {
                System.out.println("Enter a valid wheel size.");
            }
            System.out.println("What color would you like the interior? (All Black, Black and White, Cream");
            Scanner scanner2 = new Scanner(System.in);
            String interiorColor= scanner2.nextLine();
            if(interiorColor.equalsIgnoreCase("All Black"))
            {
                price+=0;
            }
            else if(interiorColor.equalsIgnoreCase("Black and White")||interiorColor.equalsIgnoreCase("Cream"))
            {
                price+=2000;
            }
            else
            {
                System.out.println("Enter a valid interior color.");
            }
            System.out.println("Enhanced Autopilot or Full Self Driving Capabilities (or neither)");
            String autopilot = scanner2.nextLine();
            if(autopilot.equalsIgnoreCase("Neither"))
            {
                price+=0;
            }
            else if(autopilot.equalsIgnoreCase("Enhanced Autopilot"))
            {
                price+=6000;
            }
            else if(autopilot.equalsIgnoreCase("Full Self Driving Capabilities"))
            {
                price+=15000;
            }
            System.out.println("Would you like a wall connector?");
            if(scanner2.nextLine().equalsIgnoreCase("Yes"))
            {
                price+=425;
            }
            else
            {
                price+=0;
            }
            System.out.println("Would you like a mobile connector?");
            if(scanner2.nextLine().equalsIgnoreCase("Yes"))
            {
                price+=230;
            }
            else
            {
                price+=0;
            }
            price+=1390;
            price+=250;
            price+=94990;

            System.out.println("Your final price for your Tesla Model S will be $"+price);
            }
        else if(model.equalsIgnoreCase("Model 3"))
        {

        }
        else if(model.equalsIgnoreCase("Model X"))
        {

        }
        else if(model.equalsIgnoreCase("Model Y"))
        {

        }
        else
        {
            System.out.println("Enter a valid model name.");
        }

    }
}


