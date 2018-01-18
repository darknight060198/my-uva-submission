import java.util.Scanner;
import java.util.Arrays;

public class p10026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            input.nextLine();
            int banyak = input.nextInt();
            Job [] arr = new Job[banyak];
            
            for (int j = 0; j < banyak; j++) {
                arr[j] = new Job(j, input.nextInt(), input.nextInt());
            }
            
            Arrays.sort(arr);
            
            for (int j = 0; j < banyak; j++) {
                if (j!=0) System.out.print(" ");
                System.out.print(arr[j].id + 1);
            }
            System.out.println();
            if (i != kasus-1) System.out.println();
        }
    }
    
    static class Job implements Comparable<Job> {
        double ratio;
        int id;
        
        public Job(int id, double harga, double time) {
            this.id = id;
            this.ratio = harga/time;
        }
        
        @Override
        public int compareTo(Job o) {
            if (this.ratio < o.ratio) return -1;
            
            if (this.ratio > o.ratio) return 1;
            
            return 0;
        }
    }
}