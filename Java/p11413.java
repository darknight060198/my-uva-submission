import java.util.Scanner;

public class FillTheContainers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int kasus = input.nextInt();
        // for (int i = 0; i < kasus; i++) {
        
        while(input.hasNext()) {
            int banyak = input.nextInt();
            int container = input.nextInt();
            int [] arr = new int[banyak];
            for (int j = 0; j < banyak; j++) {
                arr[j] = input.nextInt();
            }
            
            System.out.println(search(arr, 0, countMax(arr), container));
        }
    }
    
    static int countMax (int [] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res+=arr[i];
        }
        return res;
    }
    
    static int search (int [] arr, int low, int high, int targetContainer) {
        int res = Integer.MAX_VALUE;
        while (true) {
            if (high < low) return res;
            else {
                int mid = (high+low) / 2;
                if (cekJawaban(arr, mid, targetContainer)) {
                    if (mid < res) res = mid;
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
        }
    }
    
    static boolean cekJawaban(int [] arr, int target, int targetContainer) {
        int res = 0;
        int container = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((res + arr[i]) > target) {
//                if (i != arr.length-1) {
                    res = arr[i];
                    container++;
//                }
                if (res > target) return false;
            } else {
                res += arr[i];
            }
        }
        if (container > targetContainer) return false;
        else return true;
    }
}