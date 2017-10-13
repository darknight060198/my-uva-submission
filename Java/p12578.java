
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
public class p12578 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int length = input.nextInt();
            double luasLingkaran = luasLingkaran((length*1.0)/5.0);
            double luasPersegi = ((6.0/10.0)*(length*1.0)) * (length*1.0);
            System.out.printf("%.2f %.2f\n", luasLingkaran, (luasPersegi-luasLingkaran));
        }
    }
    
    static double luasLingkaran (double r) {
        return Math.acos(-1)*r*r;
    }
}
