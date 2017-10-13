
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
public class p10370 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int banyak = input.nextInt();
            int [] data = new int[banyak];
            int sum = 0;
            for (int j = 0; j < banyak; j++) {
                data[j] = input.nextInt();
                sum += data[j];
            }
            
            double average = (sum*1.0)/(banyak*1.0);
            int total = 0;
            
            for (int j = 0; j < banyak; j++) {
                if (data[j] > average) total++;
            }
            
            double hasil = (total*100.0)/(banyak*1.0);
            String temp = "%";
            System.out.printf("%.3f%s\n", hasil, temp);
        }
    }
}
