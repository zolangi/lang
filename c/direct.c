#include <stdio.h>
#include <stdlib.h>

#define SIZE 20

int main(void)
{
  int count, array1[SIZE], array2[SIZE];
  FILE *fp;

  //Initialize array1
  for(count = 0; count < SIZE; count++){
    array1[count] = 2*count;
  }

  //open a binary mode file
  if((fp = fopen("direct.txt", "wb")) == NULL){
      fprintf(stderr, "error opening file.");
      exit(1);
    }

  //save array1 to the file
  if(fwrite(array1, sizeof(int), SIZE, fp) !=SIZE){
    fprintf(stderr, "error writing to file..");
    exit(1);
  }
  
  fclose(fp);

  //open file recently created for reading in binary mode
  if((fp = fopen("direct.txt" ,"rb"))== NULL){
    fprintf(stderr, "error opening file");
    exit(1);
  }
  
  //read data and put it into array2
  if(fread(array2, sizeof(int), SIZE, fp) != SIZE){
    fprintf(stderr, "error reading file");
    exit(1);
  }

  fclose(fp);
  
  //Display both arrays for comparison

  for(count = 0; count < SIZE; count++){
    printf("%d\t%d\n", array1[count], array2[count]);
  }

  return 0;
}
