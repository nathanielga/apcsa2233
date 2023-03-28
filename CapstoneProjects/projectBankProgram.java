package CapstoneProjects;

import java.util.Scanner;

public class projectBankProgram
{
    Scanner scanner = new Scanner(System.in);

}
class bankAccount
{
    int balence;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int ammount)
    {
        if (ammount != 0) {
            balence = balence + ammount;
            previousTransaction = ammount;
        }
    }
    void withdraw(int ammount)
    {
        if (ammount != 0)
        {
            balence=balence-ammount;
            previousTransaction=-ammount;
        }
    }
    void getPreviousTransition()
    {
        if (previousTransaction > 0)
        {
            System.out.println("Deposited: "+previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Withdrew: "+Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }
}

