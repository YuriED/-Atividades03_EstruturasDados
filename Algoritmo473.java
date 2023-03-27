
import java.util.Scanner;
class Algoritmo473 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = input.next();
        if (consoante(letra)) {
            System.out.println("A letra digitada é uma consoante.");
        } else {
            System.out.println("A letra digitada não é uma consoante.");
        }
    }

    public static boolean consoante(String letra) {
        String consoantes = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        for (int i =0;i<consoantes.length();i++){
            if(letra.equals(consoantes)){
                return true;
            }
        }
        return false;
    }
}