import java.util.Scanner;

public class Algoritmo485 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tamanho = 0;
    System.out.print("Digite o tamanho dos vetores: ");
    tamanho = sc.nextInt();
    int[] inteiros = new int[tamanho];
    String[] caracteres = new String[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
      inteiros[i] = sc.nextInt();
      System.out.print("Digite o " + (i + 1) + "º caractere: ");
      caracteres[i] = sc.next();
    }
    for (int i = 0; i < tamanho; i++) {
      for (int j = 0; j < inteiros[i]; j++) {
        System.out.print(caracteres[i]);
      }
      System.out.println();
    }
  }
}