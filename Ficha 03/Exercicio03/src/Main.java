import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp;
        do{
            System.out.println(" ===> DIVISORES DE UM NUMERO INTEIRO POSITIVO");
            System.out.println(" ==> Digite um numero inteiro positivo");
            int n = sc.nextInt();
            if (n < 0 || n % 2 != 0){
                System.out.println(" ==> ERROR");
                System.out.println(" ==> O numero digitado nao e inteiro / nao e Positivo");
                System.exit(0);//Vai interromper a execucao do codigo.
            }
            System.out.println(" ===> Os divisores de [" + n + "], sao:");
            for(int i = 1; i <= n; i++){
                if( n % i == 0){
                    System.out.println(" ==> "+ i);
                }
            }
            System.out.println(" =====><=====><=====><===== ");
            System.out.println(" Deseja analisar mais numeros?");
            System.out.println(" SIM [1]");
            System.out.println(" NAO [2]");
            resp = sc.nextInt();
        }while(resp ==1);
        System.out.println(" =====> FIM !");
        System.out.println(" =====> Araozinx Dev");
    }
}