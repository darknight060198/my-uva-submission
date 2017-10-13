
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
public class p725 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String res = "";
        while (true) {
            int n = input.nextInt();
            if (n == 0) break;
            int abcde;
            boolean ada = false;
            for (abcde = 1234; abcde <= 98765; abcde++) {
                int fghij = abcde * n;
                int temp = 0;
                int tempAbcde = abcde, tempFghij = fghij;
                
                if (fghij > 100000) break;
                
                for (int j = 0; j < 5; j++) {
                    temp |= 1<<tempAbcde%10;
                    temp |= 1<<tempFghij%10;
                    
                    tempAbcde /= 10;
                    tempFghij /= 10;
                }
                
                if (temp == (1<<10)-1) {
                    ada = true;
                    if (abcde > 9999) {
                        res += fghij + " / " + abcde + " = " + n + "\n";
                    } else {
                        res += fghij + " / 0" + abcde + " = " + n + "\n";
                    }
                }
            }
            
            if (!ada) res += "There are no solutions for " + n + ".\n";
            
            res += "\n";
        }
        
        res = res.trim();
        System.out.println(res);
    }
}
