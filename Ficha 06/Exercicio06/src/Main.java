import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp =0;
        do{
            System.out.println(" ==> Programa Array [True] or [False] ");
            System.out.println(" ==> Digite o tamanho do array: ");
            int t = sc.nextInt();
            int []V = new int[t];
            boolean []R = new boolean[t];
            int r = t;
            for(int i =0; i<V.length;i++){
                System.out.println(" ==> Preencha o array com "+ r + " espacos: ");
                V[i] = sc.nextInt();
                r --;
            }
            for(int i =0; i<V.length;i++){
                if(V[i]>=0){
                    R[i] = true;
                }else{
                    R[i] = false;
                }
            }
            System.out.println(" ==> Resultado: ");
            System.out.println(" Explicacao: Valores positivos [True] ");
            System.out.println(" Explicacao: Valores negativos [False]");
            for(int i =0; i<R.length; i++){
                System.out.println(" ==> "+ R[i] + " <==> " + V[i]);
            }
            System.out.println(" ==> Fim ");
            System.out.println(" ========");
            System.out.println(" ==> Deseja continuar o programa? ");
            System.out.println(" ==> SIM [1]");
            System.out.println(" ==> NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ==> Fim do programa <== ");
        System.out.println(" ==> Araozinx Dev <== ");

    }
}