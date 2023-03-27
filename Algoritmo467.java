import java.lang.Math;
import java.util.Scanner;
public class Algoritmo467 {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double z,L,b;
    for(int i=1;i<=3;i++){
        System.out.println("digite logaritmo maior do que 0: ");
    L = input.nextDouble();
        while(L<=0){
    System.out.println("INvalido. digite algaritmo maior que 0: ");
    L = input.nextDouble();}

    System.out.println("digite logaritmo maior do que 0 e diferente de 1: ");
    b= input.nextDouble();
    while(b<=0||b==1){
        System.out.println("INVALIDO. digite logaritmo maior do que 0: ");
    b= input.nextDouble(); 
    }

    z = loga(L,b);
    System.out.println("logaritmo: "+z);
}
    }

    public static double loga(double num,double base){
        return Math.log(num) / Math.log(base);
       

    }

}
