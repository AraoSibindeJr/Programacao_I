import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int maior=0,posicao=0,resp=0;
        do{
            System.out.println(" ==> Analisador de Arrays <== ");
            System.out.println("==> Insira o tamanho do array: ");
            int t = sc.nextInt();
            int []V = new int[t];
            int r = t;
            for(int i =0; i<V.length;i++){
                System.out.println(" ==> Preencha o array com "+ r + " espacos: ");
                V[i]=sc.nextInt();
                r--;
            }
            for(int i = 0; i<V.length;i++){
                if(V[i]>maior){
                    maior = V[i];
                    posicao = i;
                }
            }
            System.out.println(" ==> Resultados <== ");
            System.out.println(" ==> O maior valor do array: "+ maior);
            System.out.println(" ==> O maior valor esta no indice: " + posicao);
            System.out.println(" ===> Fim");
            System.out.println(" ==> Deseja continuar analisando arrays?");
            System.out.println(" ==> SIM [1]");
            System.out.println(" ==> NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ==> Fim");
        System.out.println(" ==> Araozinx Dev");
    }
}