#include<iostream>
#include<list>
#include<vector>

using namespace std;
 
class Graph
{
    int V;
    list<int> *adj;
 
    void DFSUtil(int v, bool visited[]);
    void DFSUtilStart(int v, bool visited[]);
public:
    Graph(int V);
    void addEdge(int v, int w);
    void DFS(int v);
};
 
Graph::Graph(int V)
{
    this->V = V;
    adj = new list<int>[V];
}
 
void Graph::addEdge(int v, int w)
{
    adj[v].push_back(w); 
}
 
void Graph::DFSUtil(int v, bool visited[])
{
    visited[v] = true;
 
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            DFSUtil(*i, visited);
}

void Graph::DFSUtilStart(int v, bool visited[])
{
 
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            DFSUtil(*i, visited);
}
 
void Graph::DFS(int v)
{
    bool *visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;
 
    DFSUtilStart(v, visited);
    
    int banyakCut = 0;
    vector<int> listCut;
    
    for (int i = 0; i < V; i++) {
        if (visited[i] == 0) {
            banyakCut++;
            listCut.push_back(i+1);
        }
    }
    
    cout << banyakCut;
    int panjang = listCut.size();
    
    for (int i = 0; i < panjang; i++) {
        cout << " " << listCut[i];
    }
    
    cout << endl;
}
 
int main()
{
    int bykVertex;
    while (true) {
        cin >> bykVertex;
        if (bykVertex == 0) break;
        Graph g(bykVertex);
        int hubungan;
            while (true) {
                cin >> hubungan;
                if (hubungan == 0) break;
                int pasangan;
                while (true) {
                    cin >> pasangan;
                    if (pasangan == 0) break;
                    else g.addEdge(hubungan-1, pasangan-1);
                }
            }
        
            int banyakUjicoba;
            cin >> banyakUjicoba;
            while (banyakUjicoba--) {
                int startVertex;
                cin >> startVertex;
                g.DFS(startVertex-1);
            }
    }
    return 0;
}