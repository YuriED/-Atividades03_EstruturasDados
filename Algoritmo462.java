import java.util.Scanner;
public class Algoritmo462 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite o seu segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Digite o seu terceira nota: ");
        double nota3 = input.nextDouble();
        
        double media = media(nota1,nota2,nota3);
        System.out.println("A média das notas é: "+media);
    }
        public static double media(double nota1,double nota2,double nota3) {
            return (nota1+nota2+nota3)/3;
            
        }

}