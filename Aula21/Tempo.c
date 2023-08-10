#include <stdio.h>
#include <time.h>

int k[];
int i, n;

void compara() {
    for (i = 0; i <= 1000; i++) {
        if (k[i] == n) {
            printf("------------------------\n");
            printf("Resultado encontrado\n");
            printf("------------------------\n");
            return;
        } else {
            printf("------------------------\n");
            printf("Resultado não encontrado\n");
            printf("------------------------\n");
        }
    }
}

 

int main(void) {

  printf("Digite o valor a ser buscado: ");
  scanf("%d", &n);

  clock_t tempoInicial;
  clock_t tempoFinal;
  double dif;

  tempoInicial = clock();
  printf("\n");
  compara();
  printf("\n");
  tempoFinal = clock();

  dif = (double)(tempoFinal - tempoInicial) / CLOCKS_PER_SEC;
  printf("%lf\n", dif);

  return 0;
}