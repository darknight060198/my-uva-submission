import java.util.Scanner;

public class p10300 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		for (int i = 0; i < tc; i++) {
			int banyak = input.nextInt();
			double res = 0;
			for (int j = 0; j < banyak; j++) {
				int luas = input.nextInt();
				int binatang = input.nextInt();
				int poin = input.nextInt();
				double hasil = ((luas*1.0)/(binatang*1.0)) * (poin*1.0) * (binatang*1.0);
				res += hasil;
			}
			
			System.out.printf("%.0f\n", res);
		}
	}
}