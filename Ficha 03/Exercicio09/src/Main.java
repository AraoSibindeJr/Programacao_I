import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" =====> Estruturas de Repeticao Encadeada");
        System.out.println(" ==> Digite o fim vertical: ");
        int x = sc.nextInt();
        System.out.println(" =====> Vamo!");
        for(int i = 1; i <= x; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }
        System.out.println( "=====> Fim!");
    }
}