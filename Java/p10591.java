import java.util.Scanner;

public class p10591 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int kasus = input.nextInt();
        for (int i = 0; i < kasus; i++) {
            int num = input.nextInt();
            if (isHappy(num)) {
                System.out.printf("Case #%d: %d is a Happy number.\n", i+1, num);
            } else {
                System.out.printf("Case #%d: %d is an Unhappy number.\n", i+1, num);
            }
        }
    }
    
    private static boolean isHappy (int num) {
        int total = 0;
        do {
            total += searchDigit(num, 0);
            num = total;
            total = 0;
        } while (num > 9);
        
        if (num == 1) return true;
        else return false;
    }
    
    private static int searchDigit (int num, int total) {
        if (num < 10) {
            total += square(num);
            return total;            
        } else {
            total += square(num%10);
            return searchDigit(num/10, total);
        }
    }
    
    private static int square (int num) {
        return num*num;
    }
}