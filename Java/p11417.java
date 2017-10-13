
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JASONYEHEZKIEL
 */
public class p11417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int n = input.nextInt();
            if (n == 0)break;
            int res = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i+1; j <= n; j++) {
                    res += findGCD(i,j);
                }
            }
            
            System.out.println(res);
        }
    }
    
    static int findGCD(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            int c = num1%num2;
            num1 = num2;
            num2 = c;
        }
        
        if (num1 == 0) return num2;
        else return num1;
    }
}
