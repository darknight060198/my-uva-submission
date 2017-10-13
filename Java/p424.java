
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
public class p424 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger res = new BigInteger("0");
        while (true) {
            BigInteger num = input.nextBigInteger();
            if (num.intValue()== 0) break;
            else {
                res = res.add(num);
            }
        }
        
        System.out.println(res);
    }
}
