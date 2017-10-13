import java.util.Deque;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Iterator;

public class p10935 {
	public static void main (String [] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int num = Integer.parseInt(input.readLine());
			if (num == 0) break;
			Queue<Integer> yangDibuang = new LinkedList<>();
			Deque<Integer> tumpukanDeck = new LinkedList<>();
			
			for (int i = 1; i <=num; i++) {
				tumpukanDeck.addLast(i);
			}
			
			while (tumpukanDeck.size() != 1) {
				yangDibuang.offer(tumpukanDeck.pop());
				tumpukanDeck.addLast(tumpukanDeck.pop());
			}
			
			if (yangDibuang.size() == 0) System.out.println("Discarded cards:");
			else System.out.print("Discarded cards: ");
			
			int tempSize = yangDibuang.size();
			int temp = 1;
			
			Iterator it = yangDibuang.iterator();
			while (it.hasNext()) {
				if (temp != tempSize) {
					System.out.print(it.next() + ", ");
				} else {
					System.out.println(it.next());
				}
				temp++;
			}
			
			System.out.println("Remaining card: " + tumpukanDeck.pop());
		}
	}
}