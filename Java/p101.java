
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DarKnight98
 */
public class p101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak = input.nextInt();
        ArrayList<Stack<Integer>> data = new ArrayList<>();
        for (int i = 0; i < banyak; i++) {
            data.add(new Stack<>());
            data.get(i).push(i);
        }
        
        while (true) {
            String command1 = input.next();
            if (command1.equals("quit")) break;
            
            int value1 = input.nextInt();
            String command2 = input.next();
            int value2 = input.nextInt();
            
            if (value1 == value2) continue;
            
            
        }
    }
    
    static void moveOnto (ArrayList<Stack<Integer>> data, int blk1, int blk2) {
        int idx = -1;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).contains(blk1))
        }
    }
}
