import java.util.Scanner;

class Algoritmo470{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um numero inteiro maior que 1:  ");
        int num = scan.nextInt();

        if(primo(num)){
            System.out.println(num+  "e primo. ");
        }else {
            System.out.println(num+  "não é primo. ");
        }
    }
    public static boolean primo(int n ){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}