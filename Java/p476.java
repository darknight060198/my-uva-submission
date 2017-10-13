import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class p476 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Persegi> kumpPers = new ArrayList<>();
		while (true) {
			String [] masukan = input.readLine().split(" ");
			if (masukan[0].equals("*")) break;
			else {
			    double temp1 = Double.parseDouble(masukan[1]);
			    double temp2 = Double.parseDouble(masukan[2]);
			    double temp3 = Double.parseDouble(masukan[3]);
			    double temp4 = Double.parseDouble(masukan[4]);
				kumpPers.add(new Persegi(temp1, temp2, Math.abs(temp1-temp3), Math.abs(temp2-temp4)));
			}
		}
		
		int point = 1;
		while (true) {
			boolean status = false;
			String [] masukan = input.readLine().split(" ");
			double tempNum1 = Double.parseDouble(masukan[0]);
			double tempNum2 = Double.parseDouble(masukan[1]);
			if (tempNum1 == 9999.9 && tempNum2 == 9999.9) break;
			else {
				int figure = 1;
				Iterator<Persegi> it = kumpPers.iterator();
				while (it.hasNext()) {
					if (it.next().isInside(tempNum1, tempNum2)) {
						System.out.printf("Point %d is contained in figure %d\n", point, figure);
						status = true;
					}
					figure++;
				}
			}
			
			if (!status) {
				System.out.printf("Point %d is not contained in any figure\n", point);
			}
			point++;
		}
	}
	
	static class Persegi {
		double x, y, width, height;
		
		public Persegi(double x, double y, double width, double height) {
			this.x = x;
    		this.y = y;
    		this.width = width;
    		this.height = height;
		}
		
		public boolean isInside(double x, double y) {
    		return (x > this.x && x < (this.x + this.width) && y < this.y && y > (this.y - this.height));
    	}
	}
}