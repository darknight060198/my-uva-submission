import java.util.Scanner;

public class p679 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		while (tc-- != 0) {
			int depth = input.nextInt();
			int jatohinBola = input.nextInt();
			int max = (int)Math.pow(2,depth);
			System.out.println(search(1, jatohinBola, max));
		}
	}
	
	static int search(int node, int bola, int max) {
		int kiri = node * 2;
		int kanan = kiri + 1;
		
		if (kiri < max && kanan < max) {
			if (bola%2 == 1) return search(kiri, bola/2 + 1, max);
			else return search(kanan, bola/2, max);
		} else {
			return node;
		}
	}
}
