#include <stdio.h>

void somar(int a, int b, int *resultado) {
    *resultado = a + b;
}

int main() {
    int num1, num2;
    printf("Digite dois números inteiros: ");
    scanf("%d %d", &num1, &num2);

    int resultado;

    somar(num1, num2, &resultado);

    printf("A soma de %d e %d é %d\n", num1, num2, resultado);

    return 0;
}