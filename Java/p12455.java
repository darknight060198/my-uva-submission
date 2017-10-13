
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
public class p12455 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i  = 0; i < kasus; i++) {
            int target = input.nextInt();
            int banyak = input.nextInt();
            int [] data = new int[banyak];
            for (int j = 0; j < banyak; j++) {
                data[j] = input.nextInt();
            }
            
            Solver solver = new Solver(data, target);
            boolean hasil = solver.solve();
            if (hasil) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    static class Solver {
        private int[]data;
        private int[]temp;
        private int target;
        private boolean hasil;

        public Solver(int[] data, int target) {
            this.target = target;
            this.data = data;
            this.temp = new int[data.length];
            this.hasil = false;
        }
        
        private boolean solve() {
            solve(data.length-1);
            return this.hasil;
        }
        
        private void solve(int m) {
            if (m < 0) {
                process();
                if (hasil) return;
            } else {
                if (hasil) return;
                temp[m] = 0;
                solve(m-1);
                if (hasil) return;
                temp[m] = 1;
                solve(m-1);
            }
        }
        
        private void process() {
            int sum = 0;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == 1) sum+= data[i];
            }
            if (sum == target) hasil = true;
        }
    }
}
