
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p11879 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        BigInteger ten = new BigInteger("10");
        BigInteger five = new BigInteger("5");
        BigInteger seventeen = new BigInteger("17");
        while(true) {
            str = input.readLine();
            try {
                if (Integer.parseInt(str) == 0) break;
            } catch (Exception e) {
                
            }
            BigInteger data = new BigInteger(str);
            BigInteger temp = data.mod(ten);
            data.divide(ten);
            data.subtract(temp.multiply(five));
            if (data.mod(seventeen) == BigInteger.ZERO) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
