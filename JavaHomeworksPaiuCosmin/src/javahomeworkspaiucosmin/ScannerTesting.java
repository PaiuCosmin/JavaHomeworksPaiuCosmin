/*
 * A short demonstration of Scanner utility
 */
package javahomeworkspaiucosmin;

import java.util.Scanner;
public class ScannerTesting{
public static void main (String args[]) {

    System.out.println("Enter your name: ");
    Scanner scx = new Scanner (System.in);
    String name = scx.next();
    System.out.println("Your name is: " + name);   
}

}