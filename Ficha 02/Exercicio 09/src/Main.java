import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int maior;
        System.out.println("Digite o valor da primeira nota: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o valor da segunda nota: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o valor da tercaira nota: ");
        int n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(" =======> Resultados:");
            System.out.println(" =======> A maior nota: "+ n1);
            System.out.println(" =======> A maior nota foi obtida no Primeiro Teste");
        }else if(n2 > n1 && n2 > n3){
            System.out.println(" =======> Resultados:");
            System.out.println(" =======> A maior nota: "+ n2);
            System.out.println(" =======> A maior nota foi obtida no Segundo Teste");
        }else if(n3 > n2 && n3 > n1){
            System.out.println(" =======> Resultados:");
            System.out.println(" =======> A maior nota: "+ n3);
            System.out.println(" =======> A maior nota foi obtida no Terceiro Teste");
        }else{
            System.out.println("Nao existe uma unica maior nota!");
        }

    }
}