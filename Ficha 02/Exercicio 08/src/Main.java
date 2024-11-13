import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r;
        do{
            System.out.println(" =====> Aproveitamento Academico <=======");
            System.out.println(" ==> Insira a nota da primeira avaliacao:");
            int n1 = sc.nextInt();
            System.out.println(" ==> Insira a nota da segunda avaliacao:");
            int n2 = sc.nextInt();
            System.out.println(" ==> Insira a nota da terceira avaliacao:");
            int n3 = sc.nextInt();
            int m = (n1 + n2 + n3)/3;
            if(m > 14 && m < 20){
                System.out.println("==> Aluno Aprovado");
                System.out.println("==> Media: " + m + "Valores");
            }else if(m < 10){
                System.out.println("==> Aluno Reprovado");
                System.out.println("==> Media: " + m + "Valores");
            }else if(m>10 && m < 14){
                System.out.println("==> Aluno Realiza EXAME");
                System.out.println("==> Media: " + m + " Valores");
            }else{
                System.out.println("Notas falsas");
            }
            System.out.println("Deseja continuar?");
            System.out.println(" SIM [1]");
            System.out.println(" NAO [2]");
            r =sc.nextInt();
        }while(r == 1);

    }
}