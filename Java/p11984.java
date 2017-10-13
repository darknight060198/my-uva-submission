import java.util.Scanner;

public class p11984 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int kasus = input.nextInt();
		for (int i = 1; i <= kasus; i++) {
			int awal = input.nextInt();
			int kenaikan = input.nextInt();
			
			double temp = ((9.0/5.0)*awal)+32;
			temp += kenaikan;
			temp = (temp-32)*(5.0/9.0);
			
			System.out.printf("Case %d: %.2f\n", i, temp);
		}
	}
}