import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp = 0;
    do{
        System.out.println("Digite um numero no intervalo de [1] a [12]:");
        int r = sc.nextInt();
        switch (r){
            case 1:
                System.out.println("Mes 01");
                System.out.println("JANEIRO");
                break;
            case 2:
                System.out.println("Mes 02");
                System.out.println("FEVEREIRO");
                break;
            case 3:
                System.out.println("Mes 03");
                System.out.println("MARCO");
                break;
            case 4:
                System.out.println("Mes 04");
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("Mes 05");
                System.out.println("MAIO");
                break;
            case 6:
                System.out.println("Mes 06");
                System.out.println("JUNHO");
                break;
            case 7:
                System.out.println("Mes 07");
                System.out.println("JULHO");
                break;
            case 8:
                System.out.println("Mes 08");
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("Mes 09");
                System.out.println("SETEMBRO");
                break;
            case 10:
                System.out.println("Mes 10");
                System.out.println("OUTUBRO");
                break;
            case 11:
                System.out.println("Mes 11");
                System.out.println("NOVEMBRO");
                break;
            case 12:
                System.out.println("Mes 12");
                System.out.println("DEZEMBRO");
                break;
            default:
                System.out.println("ERROR");
                System.out.println("NOTA: Ditite apenas numeros no intervalo de [1] ate [12]");
        }
        System.out.println("============================================");
        System.out.println("=========> Araozinho Dev <==================");
        System.out.println("============================================");
        System.out.println("Deseja continuar?");
        System.out.println("[1] SIM");
        System.out.println("[2] NAO");
         resp = sc.nextInt();
    }while( resp != 2 );


    }
}