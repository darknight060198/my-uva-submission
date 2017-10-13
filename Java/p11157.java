
import java.util.ArrayList;
import java.util.List;
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
public class p11157 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int n = input.nextInt();
            int d = input.nextInt();
            ArrayList<Integer> data = new ArrayList<>();
            data.add(0);
            data.add(0);
            
            for (int j = 0; j < n; j++) {
                String [] batu = input.next().split("-", -1);
                int curRock = Integer.parseInt(batu[1]);
                data.add(curRock);
                
                if (batu[0].equals("B")) data.add(curRock);
            }
            
            data.add(d);
            data.add(d);
            
            int curMin = Integer.MIN_VALUE;
            for (int j = 2; j < data.size(); j++) {
                curMin = Math.max(curMin, data.get(j)-data.get(j-2));
            }
            
            System.out.printf("Case %d: %d\n", i+1, curMin);
        }
    }
}
