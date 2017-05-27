#include <stdio.h>
#include <stdlib.h>

void clear_kb(void);

int main(void)
{
  FILE *fp;
  int number[5];
  int count;
  char filename[20];
  int value;

  puts("Enter a 5-digit Number: ");
  scanf("%f", &value);
  int digit = value%10;

  for(count = 5; count >= 0; count--){
    number[count] = digit;
    value = value/10;
  }

  clear_kb();

  puts("Enter a name for the file.");
  gets(filename);

  if((fp = fopen(filename, "w"))== NULL){
    fprintf(stderr, "error opening file %s.", filename);
    exit(1);
  }

  fprintf(fp, "\n5-Digit number: %d", value);

  for(count = 0; count<5; count++){
    fprintf(fp, "\nnumber[%d] = %f", count, number[count]);
    fprintf(stdout, "\nnumber[%d] = %f", count, number[count]);
  }

  fclose(fp);
  printf("\n");
  return 0;
}

void clear_kb(void)
{
  char junk[80];
  gets(junk);
}

