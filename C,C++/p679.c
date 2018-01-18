#include<stdio.h>
#include<math.h>

int search(int node, int bola, int max) {
    int nodeKiri = node*2;
    int nodeKanan = nodeKiri + 1;
    if (nodeKiri < max && nodeKanan < max) {
        if (bola%2 == 0) return search(nodeKanan, bola/2, max);
        else return search(nodeKiri, bola/2 + 1, max);
    } else {
        return node;
    }
}

int main() {
   int tc;
   scanf("%d", &tc);
   while (tc--) {
       int depth, jatuhinBola;
       scanf("%d %d", &depth, &jatuhinBola);
       double max = pow(2,depth);
       printf("%d\n", search(1, jatuhinBola, (int)max));
   }
   
   return 0;
}
