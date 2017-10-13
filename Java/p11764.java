
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
public class p11764 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int banyak = input.nextInt();
            int [] wall = new int[banyak];
            for (int j = 0; j < banyak; j++) {
                wall[j] = input.nextInt();
            }
            
            int max = 0, low = 0;
            for (int j = 0; j < banyak-1; j++) {
                if (wall[j] > wall[j+1]) low++;
                else if (wall[j] < wall[j+1]) max++;
            }
            
            System.out.printf("Case %d: %d %d\n", i+1, max, low);
        }
    }
}
