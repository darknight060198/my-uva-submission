#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int MAXSIZE = 100;       
char stack[100];     
int top = -1;            

int isempty() {

   if(top == -1)
      return 1;
   else
      return 0;
}
   
int isfull() {

   if(top == MAXSIZE)
      return 1;
   else
      return 0;
}

char peek() {
   return stack[top];
}

char pop() {
   char data;
	
   if(!isempty()) {
      data = stack[top];
      top = top - 1;   
      return data;
   } else {
      printf("Could not retrieve data, Stack is empty.\n");
   }
}

void push(char data) {

   if(!isfull()) {
      top = top + 1;   
      stack[top] = data;
   } else {
      printf("Could not insert data, Stack is full.\n");
   }
}

int main () {
    int banyakGrup;
    while (1) {
        scanf("%d", &banyakGrup);
        if (banyakGrup == 0) break;

        char *input = (char*) malloc(102*sizeof(char));
        size_t buffersize = 102;
        getchar();
        getline(&input, &buffersize, stdin);

        int length = strlen(input) - 1;
        int counter = length/banyakGrup;

        int i;
        for (i = 0; i < length; i++) {
            if (input[i] == ' ') break;
            if (counter != 0) {
                push(input[i]);
                counter--;
            } else {
                while(!isempty()) {
                    char data = pop();
                    printf("%c",data);
                }
                counter = length/banyakGrup;
                i--;
            }
        }

        while(!isempty()) {
            char data = pop();
            printf("%c",data);
        }

        printf("\n");
    }


    return 0;
}