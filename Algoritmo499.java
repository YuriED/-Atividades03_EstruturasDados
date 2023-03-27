import java.util.Scanner;

public class Algoritmo499 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int op;
        boolean flag = false;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\nMENU VETOR - FUNCAO");
            System.out.println("\n1 Dados do VETOR");
            System.out.println("2 Ordena VETOR");
            System.out.println("3 Imprime VETOR");
            System.out.println("4 Sai do programa");
            System.out.print("\nOPCAO: ");

            op = input.nextInt();
            switch (op) {
                case 1:
                    entrada(num);
                    flag = true;
                    break;
                case 2:
                    if (flag) {
                        ordena(num);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 3:
                    if (flag) {
                        imprime(num);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
                    break;
            }
        } while (op != 4);
    }

    public static void entrada(int[] vet) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vet[i] = input.nextInt();
        }
    }

    public static void imprime(int[] vet) {
        System.out.println("\nVETOR");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + vet[i]);
        }
    }

    public static void ordena(int[] vet) {
        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        System.out.println("\nVETOR ordenado");
    }
}