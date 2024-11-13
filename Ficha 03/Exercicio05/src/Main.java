import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r;
        do {
            System.out.println(" =====> Geracao de Valores <===== ");
            System.out.println(" =====> Digite um numero: ");
            int n = sc.nextInt();
            System.out.println(" =================================");
            do{
                if(n%2==0){
                    n = n/2;
                }else{
                    n = 3 * n +1;
                }
                System.out.println(" =====> Numero gerado: "+ n);
            }while(n != 1);
            System.out.println(" =====> Deseja analisar mais numeros?");
            System.out.println(" ===> SIM [1]");
            System.out.println(" ===> NAO [2]");
            r = sc.nextInt();
            if (r != 1 || r!= 2){
                System.out.println("ERROR");
                System.exit(0);
            }
        }while(r==1);
        System.out.println(" =====> FIM");
        System.out.println(" =====> Araozinx Dev");
    }
}
