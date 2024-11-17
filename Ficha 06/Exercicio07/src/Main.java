import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ==> Tamanho do array: ");
        int t = sc.nextInt();
        int []v= new int[t];
        int p = t;
        // For loop para preencher o array
        for(int i =0; i < v.length; i++){
            System.out.println(" ==> Preencha o array com " + p + " espacos: ");
            v[i]=sc.nextInt();
            p--;
        }


    }

}