import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rep =0,resp;
        do{
            System.out.println(" ==> Insira o tamanho do array: ");
            int t = sc.nextInt();
            int []V = new int[t];
            int r = t;
            for(int i =0; i<V.length; i++){
                System.out.println(" ==> Preencha o array com "+ r + " espacos: ");
                V[i] = sc.nextInt();
                r--;
            }
            System.out.println(" ==> Insira o valor que deseja: ");
            int x = sc.nextInt();
            for(int i = 0; i<V.length;i++){
                if(V[i] == x){
                    rep++;
                }else{
                    rep = 0;
                }
            }
            System.out.println(" ===> Resultados ");
            System.out.println(" ==> Numero selecionado: "+ x);
            System.out.println(" ==> Numero de repeticoes: "+ rep);

            System.out.println(" ==> FIM");
            System.out.println(" ==> Deseja continuar com  o programa? ");
            System.out.println(" ==> SIM [1]");
            System.out.println(" ==> NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ==> Fim do Programa <==");
        System.out.println(" ==> Araozinx Dev <== ");

    }
}