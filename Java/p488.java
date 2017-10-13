
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i16072
 */
public class TriangleWave {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            input.nextLine();
            input.nextLine();
            int max = input.nextInt();
            int counter = input.nextInt();
            
            for (int j = 0; j < counter; j++) {
                for (int k = 1; k <= max; k++) {
                    for (int l = 0; l < k; l++) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                for (int k = max-1; k >=0; k--) {
                    for (int l = 0; l < k; l++) {
                        System.out.print(k);
                    }
                    if (j != counter-1 || k != 0) System.out.println();
                }
            }
            
            if (i != kasus-1) System.out.println();
        }
    }
}
