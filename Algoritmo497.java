
public class Algoritmo497{

public static int busca(int[] vet, int tam, int chave) {
    int ini = 0;
    int fim = tam - 1;
    int meio;

    while (ini <= fim) {
        meio = (ini + fim) / 2;
        if (chave == vet[meio]) {
            return meio;
        } else if (chave < vet[meio]) {
            fim = meio - 1;
        } else {
            ini = meio + 1;
        }
    }

    return -1;
}
}