import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class p11995 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			Stack<Integer> stackData = new Stack<>();
			Queue<Integer> queueData = new LinkedList();
			PriorityQueue<Integer> priorData = new PriorityQueue<>((x, y) -> y - x);
			
			boolean isStack = true;
			boolean isQueue = true;
			boolean isPrior = true;
			
			int banyak = input.nextInt();
			for (int i = 0; i < banyak; i++) {
				int command = input.nextInt();
				int value = input.nextInt();
				
				if (command == 1) {
					stackData.push(value);
					queueData.offer(value);
					priorData.offer(value);
				} else {
					if (isStack) {
						if (stackData.pop() != value) {
							isStack = false;
						}
					}
					
					if (isQueue) {
						if (queueData.poll() != value) {
							isQueue = false;
						}
					}
					
					if (isPrior) {
						if (priorData.poll() != value) {
							isPrior = false;
						}
					}
				}
			}
			
			if (isStack) {
				if (isQueue) {
					if (isPrior) {
						System.out.println("not sure");
					} else {
						System.out.println("not sure");
					}
				} else {
					if (isPrior) {
						System.out.println("not sure");
					} else {
						System.out.println("stack");
					}
				}
			} else {
				if (isQueue) {
					if (isPrior) {
						System.out.println("not sure");
					} else {
						System.out.println("queue");
					}
				} else {
					if (isPrior) {
						System.out.println("priority queue");
					} else {
						System.out.println("impossible");
					}
				}
			}
		}
	}
}