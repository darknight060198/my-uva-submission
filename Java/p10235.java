
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
public class p10235 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            int balik = pembalik(n);
            if (n <  10 || n == balik) {
                if (cekPrima(n)) System.out.printf("%d is prime.\n", n);
                else System.out.printf("%d is not prime.\n", n);
            } else {
                if (cekPrima(n)) {
                    if (cekPrima(balik)) System.out.printf("%d is emirp.\n", n);
                    else System.out.printf("%d is prime.\n", n);
                } else {
                    System.out.printf("%d is not prime.\n", n);
                }
            }
        }
    }
    
    static int pembalik (int num) {
        int res = 0;
        while (num > 9) {
            res = res * 10 + (num%10);
            num /= 10;
        }
        res = res * 10 + (num%10);
        return res;
    }
    
    static boolean cekPrima (int num) {
        int batas = (int)Math.sqrt(num);
        for (int i = 2; i <= batas; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
