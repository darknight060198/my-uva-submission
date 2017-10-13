
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p12250 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while (true) {
            String masukan = input.nextLine();
            if (masukan.charAt(0) == '#') break;
            
            if (masukan.equals("HELLO")) {
                System.out.printf("Case %d: %s\n", counter, "ENGLISH");
            } else if (masukan.equals("HOLA")) {
                System.out.printf("Case %d: %s\n", counter, "SPANISH");
            } else if (masukan.equals("HALLO")) {
                System.out.printf("Case %d: %s\n", counter, "GERMAN");
            } else if (masukan.equals("BONJOUR")) {
                System.out.printf("Case %d: %s\n", counter, "FRENCH");
            } else if (masukan.equals("CIAO")) {
                System.out.printf("Case %d: %s\n", counter, "ITALIAN");
            } else if (masukan.equals("ZDRAVSTVUJTE")) {
                System.out.printf("Case %d: %s\n", counter, "RUSSIAN");
            } else {
                System.out.printf("Case %d: %s\n", counter, "UNKNOWN");
            }
            
            counter++;
        }
    }
}
