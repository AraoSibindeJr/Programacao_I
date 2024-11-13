import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int y,resp;
        do{
            System.out.println(" ==> Programa Substituicao Array <== ");
            System.out.println("==> Digite o tamanho do array: ");
            int x = sc.nextInt();
            int [] V = new int[x];
            for(int i = 0; i<V.length;i++){
                System.out.println("Digite um numero positivo: ");
                y = sc.nextInt();
                if(y < 0){
                    System.out.println("Digite apenas numeros positivos!");
                    System.exit(0);
                }else{
                    V[i] = y;
                }
            }
            for(int i =0; i<V.length; i++){
                if(V[i] % 2 ==0){
                    V[i] = +1;
                }else{
                    V[i] = -1;
                }
            }
            System.out.println(" ==> Resultados:");
            for(int  i =0;i<V.length;i++){
                System.out.println(" ==> " + V[i]);
            }
            System.out.println(" ==> FIM ");
            System.out.println(" Deseja continuar?");
            System.out.println(" SIM [1]");
            System.out.println(" NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ==> Fim do Programa <== ");
        System.out.println(" ==> Araozinx");

    }
}