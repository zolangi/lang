/* inlo1.c ; Read input by calling getc()*/
#include <stdio.h>

int main()
{
  int ch;

  printf("Type in one character:\n");
  ch=getc(stdin);
  printf("The character entered is: %c\n", ch);
  return 0;
}
