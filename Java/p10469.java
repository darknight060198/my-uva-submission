
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
public class p10469 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            String a = Integer.toBinaryString(num1);
            String temp = "";
            for (int i = 0; i < 32-a.length(); i++) {
                temp += "0";
            }
            a = temp + a;
            
            temp = "";
            
            String b = Integer.toBinaryString(num2);
            for (int i = 0; i < 32-b.length(); i++) {
                temp += "0";
            }
            b = temp + b;
            
            int res = 0;
            int pangkat = 0;
            
            for (int i = a.length()-1; i >= 0; i--) {
                if ((a.charAt(i)=='0' && b.charAt(i)=='1') || (a.charAt(i)=='1' && b.charAt(i)=='0')) {
                    res += Math.pow(2, pangkat);
                }
                
                pangkat++;
            }
            
            System.out.println(res);
        }
    }
}
