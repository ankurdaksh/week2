package Assignment;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter your bank name: ");
        String bankName = scan.next();
        System.out.println("Please enter your amount: ");

        double amount = scan.nextDouble();
        System.out.println("Please enter your date month: ");
        int thisMonth = scan.nextInt();

        Interest finalInterest =   new Bank(bankName,amount,thisMonth);

        System.out.println("Bank Name "+bankName+" "+"Month "+thisMonth +" "+ "Bank Interest"+ finalInterest.calculateInterest());


    }
}

