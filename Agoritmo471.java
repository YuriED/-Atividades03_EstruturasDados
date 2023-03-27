import java.util.Scanner;

public class Agoritmo471 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);

        System.out.println("digite o dividendo: ");
        int num = scan.nextInt();

        System.out.println("digite o divisor: ");
        int num1 = scan.nextInt();
        int vezes =divisor(num,num1);
        if (num1>num){
            System.out.println("INVALIDO. digite numero menor do o dividendo: ");
        }else{
            System.out.println("o resultado é: "+vezes);
        }
        
        
    }
   public static int divisor(int num,int num1){
       int n =0;
       while (num%num1==0){
           n++;
           num/=num1;
       }
       return n;
   }
    
        
    
}
