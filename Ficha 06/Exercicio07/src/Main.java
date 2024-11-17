import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ==> Tamanho do array: ");
        int t = sc.nextInt();
        int []v= new int[t];
        int p = t, repeticoes =0;
        System.out.println(" =====><=====");
        // For loop para preencher o array
        for(int i =0; i < v.length; i++){
            System.out.println(" ==> Preencha o array com " + p + " espacos: ");
            v[i]=sc.nextInt();
            p--;
        }
        System.out.println(" =====><=====" );
        System.out.println(" =====><=====");
        // Aquisicao do numero repetido
        System.out.println(" ==> Insira o numero repetido: ");
        int x = sc.nextInt();
        for (int j : v) {
            if (j == x) {
                repeticoes++;
            }
        }
        // Saida de informacoes
        System.out.println(" ===> Resultados_Finais <=== ");
        System.out.println(" ==> Numero selecionado: " + x);
        System.out.println(" ==> Numero de repeticoes: "+ repeticoes);
        System.out.println();
        System.out.println(" ==> Fim <== ");
    }
}