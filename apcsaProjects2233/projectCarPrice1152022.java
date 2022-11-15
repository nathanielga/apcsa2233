package apcsaProjects2233;

import java.util.function.Predicate;

public class projectCarPrice1152022
{
    public static int findCarPrice(String color,int wheel,boolean sunroof)
    {
        int totalPrice =0;
        int basePrice = 20000;
        totalPrice+=basePrice;
        if(color.equalsIgnoreCase("White"))
        {
            totalPrice=totalPrice+2000;
        }
        if(color.equalsIgnoreCase("Black"))
        {
            totalPrice=totalPrice+3000;
        }
        if(color.equalsIgnoreCase("Red"))
        {
            totalPrice=totalPrice+5000;
        }
        if(wheel==19)
        {
            totalPrice=totalPrice+3000;
        }
        if(wheel==21)
        {
            totalPrice=totalPrice+5000;
        }
        if(sunroof==true)
        {
            totalPrice=totalPrice+6000;
        }
        return totalPrice;
    }

    public static void main(String[] args)
    {
        System.out.println(findCarPrice("Red",21,true));
    }
}
