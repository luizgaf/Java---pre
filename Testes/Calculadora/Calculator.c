#include <stdio.h>
#include <stdlib.h>

int main() {
    // Comando para executar o programa Java
    int result = system("java Calculator");

    // Verifica se o comando foi executado com sucesso
    if (result == 0) {
        printf("Programa Java executado com sucesso.\n");
    } else {
        printf("Erro ao executar o programa Java.\n");
    }

    return 0;
}
