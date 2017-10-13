
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
public class p382 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        while (true) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            int jumlah = penjumlahanFaktor(n);
            String res = "";
            if (n == jumlah) {
                res = "PERFECT";
            } else if (n > jumlah) {
                res = "DEFICIENT";
            } else {
                res = "ABUNDANT";
            }

            System.out.printf("%5d  %s\n", n, res);
        }

        System.out.println("END OF OUTPUT");
    }

    static int penjumlahanFaktor(int num) {
        int res = 1;
        if (num == 1) return 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                res += i;
            }
        }
        return res;
    }
}
