
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
public class p1185 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int num = input.nextInt();
            double numDigits = 0;
            for (int j = num; j > 1; j--) {
              numDigits += Math.log10(j);
            }
            
            numDigits = Math.floor(numDigits) + 1;
            System.out.println((int)numDigits);
        }
    }
}
