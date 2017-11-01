import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Iterator;

public class p10305 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			int no = input.nextInt();
			int command = input.nextInt();
			
			if (no == 0 && command == 0) break;
			
			Graph g = new Graph(no);
			
			for (int i = 0; i < command; i++) {
				int awal = input.nextInt();
				int akhir = input.nextInt();
				g.addEdge(awal-1, akhir-1);
			}
			
			g.topologicalSort();
			System.out.println();
		}
	}
	
	static class Graph
	{
		private int V;
		private LinkedList<Integer> adj[];
	 
		Graph(int v)
		{
			V = v;
			adj = new LinkedList[v];
			for (int i=0; i<v; ++i)
				adj[i] = new LinkedList();
		}
	 
		void addEdge(int v,int w) { adj[v].add(w); }
	 
		void topologicalSortUtil(int v, boolean visited[],
								 Stack stack)
		{
			visited[v] = true;
			Integer i;
	 
			Iterator<Integer> it = adj[v].iterator();
			while (it.hasNext())
			{
				i = it.next();
				if (!visited[i])
					topologicalSortUtil(i, visited, stack);
			}
	 
			stack.push(new Integer(v));
		}
	 
		void topologicalSort()
		{
			Stack stack = new Stack();
	 
			boolean visited[] = new boolean[V];
			for (int i = 0; i < V; i++)
				visited[i] = false;
	 
			for (int i = 0; i < V; i++)
				if (visited[i] == false)
					topologicalSortUtil(i, visited, stack);
	 
	        boolean temp = true;
	        
			while (stack.empty()==false) {
			    if (temp) {
			        System.out.print(((int)stack.pop())+1);
			        temp = false;
			    } else {
			        System.out.print(" " + (((int)stack.pop())+1));
			    }
			}
		}
	}
}