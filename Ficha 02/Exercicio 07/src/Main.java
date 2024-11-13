import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r;
        do{
            System.out.println("===> CALENDARIO BASICO <===");
            System.out.println("===> Escolha um numero no intervalo de [1] a [12]:");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("==> Mes: JANEIRO");
                    break;
                case 2:
                    System.out.println("==> Mes: FEVEREIRO");
                    break;
                case 3:
                    System.out.println("==> Mes: MARCO");
                    break;
                case 4:
                    System.out.println("==> Mes: ABRIL");
                    break;
                case 5:
                    System.out.println("==> Mes: MAIO");
                    break;
                case 6:
                    System.out.println("==> Mes: JUNHO");
                    break;
                case 7:
                    System.out.println("==> Mes: JULHO");
                    break;
                case 8:
                    System.out.println("==> Mes: AGOSTO");
                    break;
                case 9:
                    System.out.println("==> Mes: SETEMBRO");
                    break;
                case 10:
                    System.out.println("==> Mes: OUTUBRO");
                    break;
                case 11:
                    System.out.println("==> Mes: NOVEMBRO");
                    break;
                case 12:
                    System.out.println("==> Mes: DEZEMBRO");
                    break;
                default:
                    System.out.println(" INVALIDO ");
                    break;
            }
            System.out.println("Deseja continuar?");
            System.out.println(" SIM [1]");
            System.out.println(" NAO [2]");
            r =sc.nextInt();
        }while(r==1);
        System.out.println(" =====> FIM <=====");



    }
}