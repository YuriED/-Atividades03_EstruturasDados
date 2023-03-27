import java.util.Scanner;

class Algoritmo460 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite o seu segundo numero: ");
        int num2 = input.nextInt();

        System.out.println("Digite o seu terceiro numero: ");
        int num3 = input.nextInt();

        int dobro1 = dobro(num1);
        int dobro2 = dobro(num2);
        int dobro3 = dobro(num3);

        System.out.println("O dobro de  " + num1 + " é  " + dobro1);
        System.out.println("O dobro de  " + num2 + " é  " + dobro2);
        System.out.println("O dobro de  " + num3 + " é  " + dobro3);
    }

    public static int dobro(int num) {
        return num * 2;
    }
}
