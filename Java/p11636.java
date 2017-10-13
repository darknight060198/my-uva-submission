import java.util.Scanner;

public class p11636 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int casee = 1;
		
		while (true) {
			int num = input.nextInt();
			
			if (num < 0) break;
			
			int temp = 1, res = 0;
			
			while (temp < num) {
				temp *= 2;
				res++;
			}
			
			System.out.printf("Case %d: %d\n", casee, res);
			
			casee++;
		}
	}
}