import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int V[] = new int[10];
       int par =0, impar =0;
       for(int i =0; i <V.length; i++){
           System.out.println(" Digite um numero: ");
           V[i]=sc.nextInt();
       }
       for(int i = 0; i< V.length; i++){
           if(V[i] % 2 == 0){
               par++;
               System.out.println(" ==> Numero par "+ V[i]);
           }else{
               impar++;
               System.out.println(" ==> Numero impar "+ V[i]);
           }
       }
        System.out.println("==> Quantidade de pares: "+ par);
        System.out.println("==> Quantidade de impares: "+ par);
    }
}