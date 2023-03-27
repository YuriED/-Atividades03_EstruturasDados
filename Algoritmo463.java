import java.util.Scanner;
public class Algoritmo463 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Digite o graus: ");
        double graus =input.nextDouble();
        double radianos=radianosparaGraus(graus);

        System.out.println("graus: "+graus+  "para radianos: " +radianos);
        
    }
    public static double radianosparaGraus(double graus){
        return (graus * Math.PI/ 180);}
}
