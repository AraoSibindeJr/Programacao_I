import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int v[] = new int[5];
        for(int i = 0; i < v.length; i++){
            System.out.println("Preencher posicao "+ i);
            v[i]=sc.nextInt();
        }
        System.out.println("Insira o elemento que deseja:");
        int procura = sc.nextInt();
        int id = 0;
        boolean encontrado = false;
        for(int i =0; i <v.length; i++){
            if(v[i] == procura) {
                procura = v[i];
                encontrado = true;
            }
            else{
                encontrado = false;
            }
        }
        if(encontrado == true){
            System.out.println("Valor encontrado: "+ procura);
        }else{
            System.out.println("O Valor nao existe no vector.");
        }

    }
}