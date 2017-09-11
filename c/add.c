#include <stdio.h>

int main(void)
{
	int resultl = integer_add(9,8);
	printf("This is the sum of the function: %d", resultl);

	return 0;


}

int integer_add(int x, int y)
{
	int result;
	result = x+y;
	return result;
}
