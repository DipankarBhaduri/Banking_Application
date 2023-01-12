import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        // Prerequisite to create a account :-->>
        System.out.print("Enter Your Name to Create account : ");
        String Name = sc.next();
        System.out.print("Enter Your password to Create account : ") ;
        String password = sc.next() ;

        // Created a object of BankProcess :-->>
        BankProcess user = new BankProcess(2000, Name , password );

        //add-money into the account :
        System.out.print("How much you want to add to your Account ");
       String updatedBalance =  user.AddMoney(sc.nextInt()) ;
       System.out.println(updatedBalance);

       // check balance :-->>
        System.out.print("Enter the password to check the balance : ") ;
        String pass = sc.next() ;
        System.out.println(user.CheckBalance(pass));

        // withdraw balance :-->>
        System.out.print("Enter your required Money and password to make translation fulfil :");
        int poysa = sc.nextInt();
        pass = sc.next();
        System.out.println(user.WithdrawMoney(poysa , pass)) ;

        // RateOfInterest :-->>
        System.out.print("Enter the years in digit : ");
        int year = sc.nextInt() ;
        System.out.println("Rate of interest is : "+user.CalculateInterest(year)) ;
    }
}