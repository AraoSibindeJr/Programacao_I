import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int resp = 0;
        do{
            System.out.println("========Entrada de dados =====");
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            System.out.println("Genero:");
            System.out.println("Masculino [1]");
            System.out.println("Feminino [2]");
            int g = sc.nextInt();
            System.out.println("====> DADOS DO USUARIO");
            if(g == 1){
                System.out.println("Genero: Masculino");
            }else if( g ==2){
                System.out.println("Genero: Feminino");
            }else{
                System.out.println("Genero: Nao Identificado");
            }
            System.out.println("Idade: "+ idade);
            System.out.println("=========================");
            if(idade <= 16){
                System.out.println("Nao podes votar!");
                System.out.println("================");
            }else if(idade < 18 || idade > 65){
                System.out.println("Voto facultativo");
                System.out.println("================");

            }else{
                System.out.println("Voto Obrigatorio");
                System.out.println("================");
            }
            System.out.println("Deseja continuar analizando?");
            System.out.println("Sim [1]");
            System.out.println("Nao [2]");
            resp = sc.nextInt();
        }while(resp == 1);
        System.out.println("============> fim <==========");
        System.out.println("=====Araozin ==== dev =======");
    }
}