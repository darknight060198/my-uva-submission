
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p10887 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            ArrayList<String> data1 = new ArrayList<>();
            ArrayList<String> data2 = new ArrayList<>();
            Set<String> res = new HashSet<>();
            int banyak, banyak1;
            
            try {            
            banyak = input.nextInt();
            banyak1 = input.nextInt();
            } catch (Exception e) {
                input.nextLine();
            banyak = input.nextInt();
            banyak1 = input.nextInt();
            }
            
            input.nextLine();
            
            for (int j = 0; j < banyak; j++) {
                data1.add(input.nextLine());
            }
            
            for (int j = 0; j < banyak1; j++) {
                data2.add(input.nextLine());
            }
            
            for (int j = 0; j < banyak; j++) {
                for (int k = 0; k < banyak1; k++) {
                    res.add(data1.get(j) + data2.get(k));
//                    System.out.println(data1.get(j) + data2.get(k));
                }
            }
            
            System.out.printf("Case %d: %d\n", i+1, res.size());
        }
    }
}
