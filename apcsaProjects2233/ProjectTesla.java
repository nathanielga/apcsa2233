
package apcsaProjects2233;

import java.util.Scanner;

public class ProjectTesla
{
    public static void main(String[] args)
    {
        int price =0;
        System.out.println("What model Tesla do you want? (S,3,X,Y)");
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        if(model.equalsIgnoreCase("Model S"))
        {
            price= price+94990;
            System.out.println("Do you want the plaid model?");
            if (scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+20000;
            }
            System.out.println("What paint color would you like? (White, Black, Silver, Blue, Red)");
            String exteriorColor = scanner.nextLine();
            if(exteriorColor.equalsIgnoreCase("White"))
            {
                price=price+0;
            }
            else if(exteriorColor.equalsIgnoreCase("Black")||exteriorColor.equalsIgnoreCase("Silver")||exteriorColor.equalsIgnoreCase("Blue"))
            {
                price= price+1500;
            }
            else if(exteriorColor.equalsIgnoreCase("Red"))
            {
                price = price+2500;
            }
            else
            {
                System.out.println("Enter a valid Color");
            }
            System.out.println("What size wheels? (19in, 21in)");
            int wheelSize = scanner.nextInt();
            if(wheelSize==21)
            {
                price=price+4500;
            }
            else if(wheelSize==19)
            {
                price=price+0;
            }
            else
            {
                System.out.println("Enter a valid wheel size");
            }
            System.out.println("What interior color would you like? (BLack, White, Cream)");
            Scanner scanner2 = new Scanner(System.in);
            String interiorColor=scanner2.nextLine();
            if(interiorColor.equalsIgnoreCase("Black"))
            {
                price=price+0;
            }
            else if (interiorColor.equalsIgnoreCase("White")||interiorColor.equalsIgnoreCase("Cream"))
            {
                price=price+2000;
            }
            else
            {
                System.out.println("Enter a valid interior color");
            }
            System.out.println("Would you like Enhanced autopilot or Full Self-Driving Capability? (or neither)");
            String selfDrivingStatus = scanner2.nextLine();
            if(selfDrivingStatus.equalsIgnoreCase("neither"))
            {
                price=price+0;
            }
            else if(selfDrivingStatus.equalsIgnoreCase("Enhanced Autopilot"))
            {
                price=price+6000;
            }
            else if(selfDrivingStatus.equalsIgnoreCase("Full Self-Driving Capability"))
            {
                price=price+15000;
            }
            else
            {
                System.out.println("Enter a valid answer (make sure to input exactly as written)");
            }
            System.out.println("Would you like a wall connector?");
            boolean wallConnector;
            if(scanner2.nextLine().equalsIgnoreCase("yes"))
            {
                wallConnector=true;
            }
            else if(scanner2.nextLine().equalsIgnoreCase("No")){
                wallConnector=false;
            }
            if(wallConnector=true)
            {
                price=price+425;
            }
            else
            {
                price=price+0;
            }

            System.out.println("Would you like a mobile connector?");
            boolean mobileConnector;
            if(scanner2.nextLine().equalsIgnoreCase("yes"))
            {
                mobileConnector=true;
            }
            else if(scanner2.nextLine().equalsIgnoreCase("No")){
                mobileConnector=false;
            }
            if(mobileConnector=true)
            {
                price=price+230;
            }
            else
            {
                price=price+0;
            }
            price=price+1390+500;
            System.out.println("Your total price is $"+price);
        }
        else if(model.equalsIgnoreCase("Model 3"))
        {
            price=42990;
            System.out.println("Do you want the performance model?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=53990;
            }
            else
            {
                System.out.println("What size wheels do you want? (18in 19 in)");
                int wheelSize = scanner.nextInt();
                if(wheelSize==19)
                {
                    price=price+1500;
                }
            }
            System.out.println("What paint color? (White, Silver, Blue, Black, Red)");
            String exteriorColor = scanner.nextLine();
            if(exteriorColor.equalsIgnoreCase("Blue")||exteriorColor.equalsIgnoreCase("Silver"))
            {
                price=price+1000;
            }
            else if(exteriorColor.equalsIgnoreCase("Red"))
            {
                price=price+2000;
            }
            else
            {

            }
            System.out.println("What color for the interior? (Black, White)");
            String interiorColor = scanner.nextLine();
            if(interiorColor.equalsIgnoreCase("White"))
            {
                price=price+1000;
            }
            else
            {

            }
            System.out.println("Would you like Enhanced autopilot or Full Self-Driving Capability? (or neither)");
            String  selfDrivingCapability = scanner.nextLine();
            if(selfDrivingCapability.equalsIgnoreCase("Enhanced Autopilot"))
            {
                price=price+6000;

            }
            else if(selfDrivingCapability.equalsIgnoreCase("Full Self-Driving Capability"))
            {
                price=price+15000;
            }
            else
            {

            }
            System.out.println("Would you like a wall connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+425;
            }
            else
            {

            }
            System.out.println("Would you like a mobile connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+230;
            }
            System.out.println("Your final price is $"+(price+1390+250));
        }
        else if (model.equalsIgnoreCase("Model X"))
        {
            int seatNumber;
            price=109990;
            System.out.println("Do you want the plaid model?");
            boolean plaidStatus;

            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                plaidStatus=true;
                price=119990;
                seatNumber=6;
            }
            else
            {
                plaidStatus=false;
            }
            System.out.println("What color paint? (White, Black, Silver, Blue, Red)");
            String paintColor=scanner.nextLine();
            if(paintColor.equalsIgnoreCase("Black")||paintColor.equalsIgnoreCase("Blue")||paintColor.equalsIgnoreCase("Silver"))
            {
                price=price+1500;
            }
            else if(paintColor.equalsIgnoreCase("red"))
            {
                price=price+2500;
            }
            else
            {

            }
            System.out.println("What size wheels? (20in 22in)");
            int wheelSize = scanner.nextInt();
            if(wheelSize==22)
            {
                price=price+5500;
            }
            else
            {

            }
            System.out.println("What color interior? (Black, White, Cream)");
            if(scanner.nextLine().equalsIgnoreCase("white")||scanner.nextLine().equalsIgnoreCase("cream"))
            {
                price=price+2000;
            }
            else
            {

            }
            System.out.println("How many seats in the car? (5, 6,7)");
            wheelSize=scanner.nextInt();
            if(wheelSize==7)
            {
                price=price+3500;
            }
            else if((wheelSize==6&&plaidStatus!=true))
            {
                price=price+6500;
            }
            else if((wheelSize == 6 && plaidStatus==true))
            {
                price=price;
            }
            System.out.println("Would you like Enhanced autopilot or Full Self-Driving Capability? (or neither)");
            if(scanner.nextLine().equalsIgnoreCase("Enhanced Autopilot"))
            {
                price=price+6000;

            }
            else if(scanner.nextLine().equalsIgnoreCase("Full Self-Driving Capability"))
            {
                price=price+15000;
            }
            else
            {

            }
            System.out.println("Would you like a wall connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+425;
            }
            else
            {

            }
            System.out.println("Would you like a mobile connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+230;
            }
            System.out.println("Your final price is $"+(price+1390+250));

        }
        else if (model.equalsIgnoreCase("Model Y"))
        {
            boolean performance;
            int seatNumber;
            price=54990;
            System.out.println("Would you like the performance model?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                performance=true;
                price=59990;
                seatNumber=5;
            }
            else
            {
                performance=false;
                System.out.println("What size wheels? (19in, 20in)");
                if(scanner.nextInt()==20)
                {
                    price=price+2000;
                }
            }

            System.out.println("What color paint (white, silver, blue, black, red)");
            String paintColor = scanner.nextLine();
            if(paintColor.equalsIgnoreCase("Silver")||paintColor.equalsIgnoreCase("blue"))
            {
                price=price+1000;
            }
            else if(paintColor.equalsIgnoreCase("black"))
            {
                price=price+1500;
            }
            else if(paintColor.equalsIgnoreCase("red"))
            {
                price=price+2000;
            }
            else
            {

            }
            System.out.println("Would you like a tow hitch");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+1000;
            }
            else
            {

            }
            System.out.println("What color would you like the interior? (Black, White)");
            if(scanner.nextLine().equalsIgnoreCase("white"))
            {
                price=price+1000;
            }
            else
            {

            }
            System.out.println("How many seats do you want in the car? (5,7)");
            seatNumber=scanner.nextInt();
            if(seatNumber==7)
            {
                price=price+4000;
            }
            else
            {

            }
            System.out.println("Would you like Enhanced autopilot or Full Self-Driving Capability? (or neither)");
            if(scanner.nextLine().equalsIgnoreCase("Enhanced Autopilot"))
            {
                price=price+6000;

            }
            else if(scanner.nextLine().equalsIgnoreCase("Full Self-Driving Capability"))
            {
                price=price+15000;
            }
            else
            {

            }
            System.out.println("Would you like a wall connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+425;
            }
            else
            {

            }
            System.out.println("Would you like a mobile connector?");
            if(scanner.nextLine().equalsIgnoreCase("yes"))
            {
                price=price+230;
            }
            System.out.println("Your final price is $"+(price+1390+250));
        }
        else
        {
            System.out.println("Enter a valid model name");
        }
    }
}
