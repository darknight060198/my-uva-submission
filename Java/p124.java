import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class FollowingOrders {
    static LinkedList<Integer>[] G;
    static int[] indegree;
    static int[] map = new int[128];
    static char[] unmap;
    static int n;
    static StringBuilder out;
    static char[] res;
 
    public static void dfs(int left) {
        if (left == 0)
            out.append(new String(res) + '\n');
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                indegree[i] = -1;
                res[n - left] = unmap[i];
                for (int j : G[i])
                    indegree[j]--;
                dfs(left - 1);
                for (int j : G[i])
                    indegree[j]++;
                indegree[i] = 0;
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        while (in.hasNext()) {
            if (flag)
                System.out.println();
            flag = true;
            String[] symb = in.nextLine().split(" ");
            String[] comp = in.nextLine().split(" ");
            Arrays.sort(symb);
            out = new StringBuilder();
            n = symb.length;
            unmap = new char[n];
            G = new LinkedList[symb.length];
            indegree = new int[symb.length];
            for (int i = 0; i < G.length; i++)
                G[i] = new LinkedList<Integer>();
            for (int i = 0; i < symb.length; i++) {
                map[symb[i].charAt(0)] = i;
                unmap[i] = symb[i].charAt(0);
            }
            res = new char[n];
            for (int i = 0; i < comp.length; i += 2) {
                int s = map[comp[i].charAt(0)];
                int t = map[comp[i + 1].charAt(0)];
                indegree[t]++;
                G[s].add(t);
            }
            dfs(n);
            System.out.print(out);
        }
    }
}