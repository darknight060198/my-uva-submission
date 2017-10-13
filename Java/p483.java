
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
public class p483 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNextLine()) {
            String masukan = input.nextLine();
            String [] hasil = masukan.split(" ", -1);
            for (int i = 0; i < hasil.length; i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(new StringBuilder(hasil[i]).reverse().toString());
            }
            System.out.println();
        }
    }
}
