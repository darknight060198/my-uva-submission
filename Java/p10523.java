
import java.math.BigInteger;
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
public class p10523 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int a = input.nextInt();
            BigInteger A = new BigInteger(a+"");
            BigInteger num = BigInteger.ZERO;
            
            for (int i = 1; i <= n; i++) {
                num = num.add(A.pow(i).multiply(new BigInteger(i+"")));
            }
            
            System.out.println(num.toString());
        }
    }
}
