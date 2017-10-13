package SOLVED;


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
public class p10783 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        
        for (int i = 0; i < kasus; i++) {
            int bawah = input.nextInt();
            int atas = input.nextInt();
            int res = 0;
            if (bawah%2 == 0) {
                bawah ++;
            }
            
            for (int j = bawah; j <= atas; j+=2) {
                res += j;
            }
            
            System.out.printf("Case %d: %d\n", i+1, res);
        }
    }
}
