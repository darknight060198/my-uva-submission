import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;

public class p280
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
		while (true) {
			int bykVertex = input.nextInt();
			if (bykVertex == 0) break;
			Graph g = new Graph(bykVertex);
			
			while (true) {
				int hubungan = input.nextInt();
				if (hubungan == 0) break;
				
				while (true) {
					int pasangan = input.nextInt();
					if (pasangan == 0) break;
					else g.addEdge(hubungan-1, pasangan-1);
				}
			}
			
			int banyakUjicoba = input.nextInt();
			for (int i = 0; i < banyakUjicoba; i++) {
				int startVertex = input.nextInt();
				g.DFS(startVertex-1);
			}
		}
    }
    
    static class Graph {
        
        private int V;
    
        private LinkedList<Integer> adj[];
    
        public Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }
    
        void addEdge(int v, int w)
        {
            adj[v].add(w);
        }
    	
    	void DFSUtilStart(int v,boolean visited[])
        {
    
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }
    
        void DFSUtil(int v,boolean visited[])
        {
            visited[v] = true;
    
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }
    
        void DFS(int v)
        {
            boolean visited[] = new boolean[V];
    
            DFSUtilStart(v, visited);
    		
    		int banyakCut = 0;
    		ArrayList<Integer> listCut = new ArrayList<>();
    		
    		for (int i = 0; i < V; i++) {
    			if (!visited[i]) {
    				banyakCut++;
    				listCut.add(i+1);
    			}
    		}
    		
    		System.out.print(banyakCut);
    		Iterator<Integer> it = listCut.iterator();
    		
    		while (it.hasNext()) {
    			System.out.print(" " + it.next());
    		}
    		
    		System.out.println();
        }
    }
}