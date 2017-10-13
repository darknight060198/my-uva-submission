import java.util.Scanner;

public class p10221 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int s = input.nextInt();
			int a = input.nextInt();
			String command = input.next();
			s += 6440;
			if (a > 180) a = 360-a;
			double angle = a;
			if (command.equals("min")) angle /= 60;
			angle = (Math.PI*angle)/180.0;
			double jarak = s*angle;
			double jarak_chord = 2*s*Math.sin(angle/2.0);
			System.out.printf("%.6f %.6f\n", jarak, jarak_chord);
		}
	}
}