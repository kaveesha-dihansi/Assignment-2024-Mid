/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesment;

/**
 *
 * @author ASUS0000
 */
import java.util.Scanner;

public class BankAccount {

    private String fullName;
    private String accountNumber;
    private double accountBalance;
    

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        BankAccount ac1 = new BankAccount();
        BankAccount ac2 = new BankAccount();

        System.out.println("Account no 1 details : ");
        System.out.println("=======================");
        System.out.println("Enter your full name :");
        ac1.fullName = s.nextLine();
        System.out.println("\nAccount number : ");
        ac1.accountNumber = s.nextLine();
        System.out.println("\nAccount Balance : ");
        ac1.accountBalance = s.nextInt();

        System.out.println("Account no 2 details : ");
        System.out.println("=======================");
        System.out.println("Enter your full name :");
        ac2.fullName = s.next() ;
        System.out.println("\nAccount number : ");
        ac2.accountNumber = s.next();
        System.out.println("\nAccount Balance : ");
        ac2.accountBalance = s.nextInt();

        String acname1 = ac1.getFullName().trim().toUpperCase();
        String acname2 = ac2.getFullName().trim().toUpperCase();

        String bankaccount = (ac1.getAccountBalance() > ac2.getAccountBalance()) ? acname1 : acname2;
        System.out.println("The highest amount of money account name is : " + bankaccount);

    }

}
