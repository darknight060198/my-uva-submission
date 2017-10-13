
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
public class p12289 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] data = new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int temp = 0;
            int res = 0;
            String masukan = input.next();
            for (int j = 0; j < data.length; j++) {
                for (int k = 0; k < masukan.length(); k++) {
                    if (data[j].charAt(k) != masukan.charAt(k)) temp++;
                    if (temp > 1) break;
                    if (temp <= 1 && k == masukan.length()-1) res = j+1;
                }
                temp = 0;
            }
            System.out.println(res);
        }
    }
}
