import java.util.Scanner;

public class Algoritmo481 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o número em decimal que deseja converter: ");
        int num = scan.nextInt();
        System.out.println("digite a base na qual voce deseja representa-lo (2-10): ");
        int base = scan.nextInt();

        if (base <2||base>10){
            System.out.println("A base deve estar entre2 e 10.");
            return ;
        }

        String resultado = decimal(num , base );
        System.out.println("o número "+num+ "em base "+resultado );
        
    }
    private static String decimal(int num, int base) {
        StringBuilder result = new StringBuilder();
        while (num>0){
            int resto = num %base ;
            result.append(resto);
            num=num/base;
        }
        return result.reverse().toString();
    }
    
    
}
