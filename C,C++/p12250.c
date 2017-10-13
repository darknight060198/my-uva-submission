#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *english = "HELLO\n";
char *spanish = "HOLA\n";
char *german = "HALLO\n";
char *french = "BONJOUR\n";
char *italian = "CIAO\n";
char *russian = "ZDRAVSTVUJTE\n";

int main() {
    int i = 1;
    while (1) {
        char *input = (char*) malloc(14*sizeof(char));
        // if (input[0] == '#') break;
        size_t buffersize = 14;
        getline(&input, &buffersize, stdin);

        if (strcmp(input, "#") == 0 || strcmp(input, "#\n") == 0) break;
        
        if (strcmp(input, english) == 0) {
            printf("Case %d: %s\n", i, "ENGLISH");
        } else if (strcmp(input, spanish) == 0) {
            printf("Case %d: %s\n", i, "SPANISH");
        } else if (strcmp(input, german) == 0) {
            printf("Case %d: %s\n", i, "GERMAN");
        } else if (strcmp(input, french) == 0) {
            printf("Case %d: %s\n", i, "FRENCH");
        } else if (strcmp(input, italian) == 0) {
            printf("Case %d: %s\n", i, "ITALIAN");
        } else if (strcmp(input, russian) == 0) {
            printf("Case %d: %s\n", i, "RUSSIAN");
        } else {
            printf("Case %d: UNKNOWN\n", i);
        }

        i++;
    }
    return 0;
}