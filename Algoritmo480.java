import java.util.Scanner;

public class Algoritmo480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = scan.nextInt();
        if (reverse(num)) {
            System.out.println(num + "é um número capicua");
        } else {
            System.out.println(num + "não é um número capicua");
        }

    }

    public static boolean reverse(int num) {
        int reverso = reverso(num);
        return num == reverso;
    }

    public static int reverso(int num) {
        int numeroInverso = 0;
        int numero = num;

        while (numero != 0) {

            numeroInverso = numeroInverso * 10 + numero % 10;
            numero /= 10;

        }
        return numeroInverso;
    }
}
