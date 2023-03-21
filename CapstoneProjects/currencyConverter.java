package CapstoneProjects;
import java.util.Scanner;
public class currencyConverter
{
    public static void main(String[] args)
    {
        double conversionRate = 0;
        double amount;
        String secondCurrency;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);

        System.out.println("Enter the amount of USD you want to convert");
        amount=scanner.nextDouble();
        System.out.println("Enter the currency you want to convert into");
        secondCurrency= scanner2.nextLine();

        if(secondCurrency.equalsIgnoreCase("GBP"))
        {
            conversionRate=0.82;
        }
        else if(secondCurrency.equalsIgnoreCase("AUD"))
        {
            conversionRate=1.5;
        }
        else if(secondCurrency.equalsIgnoreCase("JPY"))
        {
            conversionRate=132.23;
        }
        else if(secondCurrency.equalsIgnoreCase("CNY"))
        {
            conversionRate=6.87;
        }
        else if(secondCurrency.equalsIgnoreCase("MXN"))
        {
            conversionRate=18.7;
        }
        else if(secondCurrency.equalsIgnoreCase("INR"))
        {
            conversionRate=82.62;
        }
        else if(secondCurrency.equalsIgnoreCase("EUR"))
        {
            conversionRate=0.93;
        }
        else if(secondCurrency.equalsIgnoreCase("RUB"))
        {
            conversionRate=76.87;
        }
        else if(secondCurrency.equalsIgnoreCase("ZAR"))
        {
            conversionRate=18.51;
        }
        else if(secondCurrency.equalsIgnoreCase("SGD"))
        {
            conversionRate=1.34;
        }
        else
        {
            System.out.println("Enter a valid currency (make sure it is in abbreviation form)");
        }
        System.out.println(amount+"USD is "+(amount*conversionRate)+" "+secondCurrency);
    }
}
