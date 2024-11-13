import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, resp;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("========> MAQUINA BASICA <===========");
            System.out.println(" Escolha uma operacao:");
            System.out.println(" [1]  Soma ");
            System.out.println(" [2] Subtraccao");
            System.out.println(" [3] Divisao");
            System.out.println(" [4] Multiplicacao");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("==> Digite o primeiro numero:");
                    n1 = sc.nextInt();
                    System.out.println("==> Digite o segundo numero;");
                    n2 = sc.nextInt();
                    int soma = n1 + n2;
                    System.out.println("=====> RESULTADO <=====");
                    System.out.println( "==> "+ n1 + " + " + n2 + " = " + soma);
                    break;
                case 2:
                    System.out.println("==> Digite o primeiro numero:");
                    n1 = sc.nextInt();
                    System.out.println("==> Digite o segundo numero;");
                    n2 = sc.nextInt();
                    int sub = n1 - n2;
                    System.out.println(" ====> Resultado <=====");
                    System.out.println("==> "+ n1 + " - " + n2 + " = " + sub);
                    break;
                case 3:
                    System.out.println("==> Digite o primeiro numero:");
                    n1 = sc.nextInt();
                    System.out.println("==> Digite o segundo numero;");
                    n2 = sc.nextInt();
                    double div = n1/n2;
                    System.out.println(" ====> Resultado <=====");
                    System.out.println("==> "+ n1 + " / " + n2 + " = " + div);
                    break;
                case 4:
                    System.out.println("==> Digite o primeiro numero:");
                    n1 = sc.nextInt();
                    System.out.println("==> Digite o segundo numero;");
                    n2 = sc.nextInt();
                    int multi = n1 * n2;
                    System.out.println(" ====> Resultado <=====");
                    System.out.println("==> "+ n1 + " * " + n2 + " = " + multi);
                    break;
                default:
                    System.out.println(" ====> ERROR <====");
                    System.out.println(" ====> Escolha uma opcao [1]/[2]/[3]/[4]");
                    break;
            }
            System.out.println(" ====================================================");
            System.out.println(" ====================================================");
            System.out.println(" Deseja continuar?");
            System.out.println(" [1] SIM");
            System.out.println(" [2] NAO");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ===============> Maqquina Basica  <======================================");
        System.out.println(" ==============>    ARAOZIN DEV<   <======================================");


    }
}