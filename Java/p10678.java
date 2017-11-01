import java.util.Scanner;

public class p10678 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer br = new StringBuffer("");

		int tc = sc.nextInt();

		for (int i = 1; i<= tc;i++) {
			double d= sc.nextDouble();
			double l = sc.nextDouble();
			double a = Math.sqrt(.25 * (l*l - d*d));
			double b = l/2.0;
			double area = Math.PI*a*b*1000;
			System.out.printf("%.3f\n",Math.round(area)/1000.0);
		}
	}
}