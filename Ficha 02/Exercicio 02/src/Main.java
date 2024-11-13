import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp = 0;
        do{
            System.out.println("Digite um numero no intervalo de [1] ate [5]:");
            int r = sc.nextInt();
            switch (r){
                case 1:
                    System.out.println("Nota = 1");
                    System.out.println("PESSIMA.");
                    break;
                case 2:
                    System.out.println("Nota = 2");
                    System.out.println("RUIM.");
                    break;
                case 3:
                    System.out.println("Nota = 3");
                    System.out.println("REGULAR.");
                    break;
                case 4:
                    System.out.println("Nota = 4");
                    System.out.println("BOA.");
                    break;
                case 5:
                    System.out.println("Nota = 15");
                    System.out.println("OTIMA.");
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("NOTA: Digite apenas numeros no intervalo de [1] ate [5]");
                    break;
            }
            System.out.println("============================");
            System.out.println("=========>'Araozin'<==========");
            System.out.println("============================");
            System.out.println("Deseja continuar?");
            System.out.println("[1] SIM");
            System.out.println("[2] NAO");
            resp = sc.nextInt();
     }while(resp == 1);
    }
}




