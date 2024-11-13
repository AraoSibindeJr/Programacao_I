import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" =====> Gerador de Tabuada [1] ate [12]");
        System.out.println(" =====> Digite um numero inteiro: ");
        int x = sc.nextInt();
        System.out.println("==> Tabuada de "+ x + " :");
        System.out.println("==> INICIO:");
        for(int i = 1; i <= 12; i++){
            System.out.println( "==> "+ x +" X " + i + " = " + x*i );
        }
        System.out.println("==> FIM!");
        System.out.println("===> Araozinx Dev");

    }
}