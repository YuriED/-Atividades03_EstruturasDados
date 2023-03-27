import java.util.Scanner;

public class Algoritmo0483 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor1 = new int[4];
        int[] vetor2 = new int[4];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < 4; i++) {
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < 4; i++) {
            vetor2[i] = scan.nextInt();
        }

        int produtoInterno = resultado(vetor1, vetor2);
        System.out.println("O produto interno entre os vetores é: " + produtoInterno + ";");
    }

    public static int resultado(int[] vetor1, int[] vetor2) {
        int produtoInterno = 0;
        for (int i = 0; i < 4; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }
        return produtoInterno;
    }
}
