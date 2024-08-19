/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesment;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class ContactDetails {

    public long telephone_number;

    public static void main(String[] args) {
        
        
        ContactDetails cd = new ContactDetails();
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your telephone= number : ");
        cd.telephone_number=s.nextLong();
        
        Long telephone_number_long=cd.telephone_number;
        
        String telenumberstring = telephone_number_long.toString();
        System.out.println("length of tele no is : "+telenumberstring.length());

    }

}
