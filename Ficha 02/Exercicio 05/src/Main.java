
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double cred ;
        double percent;
        int r ;
        int resp;
        do{
            System.out.println("===========BANCO DE MOCAMBIQUE ============");
            System.out.println("===> Informacoes da Conta <===");
            System.out.println("==> Insira saldo medio: ");
            double sm = sc.nextDouble();
            if(sm <= 200.0){
                cred = 0.0;
                r = 0;
            }else if(sm <= 400.0){
                percent = sm * 0.2;
                cred = percent;
                r = 2;
            }else if(sm<=600){
                percent = sm * 0.3;
                cred = percent;
                r =3;
            }else{
                percent = sm * 0.4;
                cred = percent;
                r = 4;
            }
            System.out.println("=======> BANCO DE MOCAMBIQUE <========");
            System.out.println("==> Saldo medio da conta: " + sm);
            System.out.println("==> Percentagem de credito: " + r+"%" );
            System.out.println("==> Valor do credito: "+ cred+"$");
            System.out.println("==============> BANCO DE MOCAMBIQUE <================");
            System.out.println("==================>  ARAOZINX DEV <==================");
            System.out.println("Deseja analisar outra conta?");
            System.out.println(" SIM [1]");
            System.out.println(" NAO [2]");
            resp = sc.nextInt();
        }while(resp == 1);



    }
}