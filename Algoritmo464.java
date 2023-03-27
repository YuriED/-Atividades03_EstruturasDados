import java.util.Scanner;
public class Algoritmo464 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Digite o radianos: ");
        double radianos =input.nextDouble();
        double graus=grausparaRadianos(radianos);

        System.out.println("Radianos: " +radianos+  "para Graus: " +graus);
        
    }
    public static double grausparaRadianos(double radianos){
        
        return radianos *( 180 / Math.PI);}
}

