import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class p11849 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String [] temp = input.readLine().split(" ");
			int total = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
			if (total == 0) break;
			
			HashSet<Integer> dataCD = new HashSet<>();
			HashMap<Integer, Integer> dataCD2 = new HashMap<>();
			
			for (int i = 0; i < total; i++) {
				int tempCD = Integer.parseInt(input.readLine());
				if (dataCD.add(tempCD)) {
					dataCD2.put(tempCD, 1);
				} else {
					dataCD2.put(tempCD, dataCD2.get(tempCD) + 1);
				}
			}
			
			int res = 0;
			Iterator<Integer> it = dataCD.iterator();
			while (it.hasNext()) {
				int tempCD = it.next();
				if (dataCD2.get(tempCD) > 1) res++;
			}
			
			System.out.println(res);
		}
	}
}