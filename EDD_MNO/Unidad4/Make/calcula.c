#include <stdio.h>
#include "calc.h"

int main(){
	int op1=10;
	int op2=5;
	int op3;
	printf("La suma de %d i %d es %d\n", op1,op2,suma(op1,op2));
	printf("La resta de %d i %d es %d\n", op1,op2,resta(op1,op2));
	printf("La multiplicacio de %d i %d es %d\n", op1,op2,multiplica(op1,op2));
	printf("La divisio de %d i %d es %d\n", op1,op2,divideix(op1,op2));
	printf("El major es %d\n",major(op1,op2,op3));
}
