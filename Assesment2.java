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

public class Assesment2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = s.nextInt();

        System.out.println("multiplication table for : " + num);

        System.out.println("===============================");
        multitable(num,1);
    }

     public static void multitable(int num,int mul) {
         if(mul<=12) {
             System.out.printf("%d \tx\t %d \t=\t %d%n",mul,num,mul*num);
             multitable(num,mul+1);
         }
     }
}
