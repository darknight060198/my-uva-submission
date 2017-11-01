#include<iostream>
#include <list>
#include <stack>
using namespace std;
 
class Graph
{
    int V;
 
    list<int> *adj;
 
    void topologicalSortUtil(int v, bool visited[], stack<int> &Stack);
public:
    Graph(int V);
 
    void addEdge(int v, int w);
 
    void topologicalSort();
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
 
void Graph::topologicalSortUtil(int v, bool visited[], 
                                stack<int> &Stack)
{
    visited[v] = true;
 
    list<int>::iterator i;
    for (i = adj[v].begin(); i != adj[v].end(); ++i)
        if (!visited[*i])
            topologicalSortUtil(*i, visited, Stack);
 
    Stack.push(v);
}
 
void Graph::topologicalSort()
{
    stack<int> Stack;
 
    bool *visited = new bool[V];
    for (int i = 0; i < V; i++)
        visited[i] = false;
 
    for (int i = 0; i < V; i++)
      if (visited[i] == false)
        topologicalSortUtil(i, visited, Stack);
 
    bool temp = true;
 
    while (Stack.empty() == false)
    {
        if (temp) {
            cout << Stack.top()+1;
            Stack.pop();
            temp = false;
        } else {
            cout << " " << Stack.top()+1;
            Stack.pop();
        }
    }
}
 
int main()
{
    while (true) {
        int no, command;
        cin >> no >> command;
        if (no == 0 && command == 0) break;
        
        Graph g(no);
        while (command--) {
            int mulai, tujuan;
            cin >> mulai >> tujuan;
            g.addEdge(mulai-1, tujuan-1);
        }
        
        g.topologicalSort();
        cout << endl;
    }
    return 0;
}