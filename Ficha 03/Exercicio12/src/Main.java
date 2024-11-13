import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int maior=0, soma=0,menor =0;
        Scanner sc = new Scanner (System.in);
        System.out.println(" ===> Analisador de numeros: ");
        System.out.println(" ==> Digite o limite do conjunto de numeros: ");
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            System.out.println(" ==> Digita um numero: ");
            int num = sc.nextInt();
            if(num < menor){
                menor = num;
            }else {
                maior = num;
            }
            soma += num;
        }
        System.out.println(" =====> Resultados");
        System.out.println(" ==> Conjunto de: "+ n + " numeros");
        System.out.println(" ==> Menor numero do conjunto: "+ menor);
        System.out.println(" ==> Maior numero do conjunto: "+ maior );
        System.out.println(" ==> Soma dos numeros do conjunto: " + soma);
        System.out.println(" ==========> FIM ");
        System.out.println(" ==========> Araozinx Dev!");

    }
}