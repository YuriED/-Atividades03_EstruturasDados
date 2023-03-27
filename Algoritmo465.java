import java.util.Scanner;

public class Algoritmo465 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o seu segundo número: ");
        int num2 = input.nextInt();

        imprimeMaiorNumero(num1, num2);
    }

    public static void imprimeMaiorNumero(int num1, int num2) {
        int maximo = num1 > num2 ? num1 : num2;
        System.out.println("Entre o número " + num1 + " e " + num2 + ", o maior é: " + maximo);
    }
}
