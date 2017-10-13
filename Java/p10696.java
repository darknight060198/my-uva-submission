import java.util.Scanner;

public class p10696 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			int num = input.nextInt();
			
			if (num == 0) break;
			
			System.out.printf("f91(%d) = %d\n", num, f91(num));
		}
	}
	
	static int f91(int num) {
		if (num <= 100) return f91(f91(num+11));
		else return num-10;
	}
}