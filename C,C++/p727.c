#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct stack {
    int top;
    char data[50];
};

int rating[1000];
char buf[100000];

void push (struct stack *stk, char value);
char peek (struct stack stk);
char pop (struct stack *stk);
int isEmpty(struct stack *stk);
void solve(char *inp);

int main () {
    int kase=1, kounter=1;
    
        rating['/'] = 3;
        rating['*'] = 3;
        rating['-'] = 1;
        rating['+'] = 1;
    
        scanf("%d",&kase);
        getchar();
        gets(buf);
    
        while (kase--)
        {
            if (kounter++ > 1) printf("\n");
    
            char * inp = "";
            while ( gets(buf) )
            {
                if (!strcmp(buf,"")) break;
    
                char * temp = malloc(strlen(inp)+2);
                strcpy(temp, inp);
                strcat(temp, buf);

                inp = temp;
            }

    
            if (inp == "") continue;

            solve(inp);
            printf("\n");
        }
}

int isEmpty(struct stack *stk) {
    if (stk->top == -1) return 1;
    else return 0;
}

void push (struct stack *stk, char value) {
    if (stk->top == 49) printf("ERROR FULL STACK!!");
    else {
        stk->top++;
        stk->data[stk->top] = value;
    }
}

char peek (struct stack stk) {
    return stk.data[stk.top];
}

char pop (struct stack *stk) {
    if (isEmpty(stk)) printf("ERROR STACK EMPTY!");
    else {
        char res = stk->data[stk->top];
        stk->top--;
        return res;
    }
    return '\0';
}


void solve(char *inp) {
    int i, length = strlen(inp);
    struct stack stk;
    stk.top= -1;

    for (i = 0; i<length; i++) {
        if (inp[i] == '(') push(&stk, inp[i]);
        if (inp[i] == ')') {
            while (peek(stk) != '(') {
                char c = pop(&stk);
                printf("%c", c);
            }
            pop(&stk);
        }

        if (inp[i]=='/' || inp[i]=='*' || inp[i]=='+' || inp[i]=='-' ) {
            if (isEmpty(&stk) || peek(stk) == '(') {
                push(&stk, inp[i]);
            } else {
                while (isEmpty(&stk) == 0 && rating[ inp[i] ] <= rating[ peek(stk) ])
                {
                    char ch = pop(&stk);
                    printf("%c", ch);
                }
                push(&stk, inp[i]);
            }
        }

        if (inp[i]>='0' && inp[i]<='9') {
            printf("%c", inp[i]);
        }
    }

    while (isEmpty(&stk) == 0)
    {
        if (peek(stk) == '(') {  }
        else printf("%c", pop(&stk));
    }
}