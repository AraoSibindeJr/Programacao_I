import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int n1, n2, n3;
        int maior, menor, medio;
        do {
            if (c != 0) {
                c = 0;
            }
            System.out.println("Digite tres numeros inteiros, diferentes:");
            System.out.println("Primeiro numero digitado:");
            n1 = sc.nextInt();
            System.out.println("Segundo numero digitado:");
            n2 = sc.nextInt();
            System.out.println("Terceiro numero digitado:");
            n3 = sc.nextInt();
            if (n1 == n2 && n2 == n3) {
                System.out.println("==============TEMOS UM ERRO===============");
                System.out.println("NOTA: Inserir numeros diferentes entre si!");
                System.out.println("=============> araozinx Dev<===============");
                c++;
            } else if (n1 == n2 || n2 == n3) {
                System.out.println("==============TEMOS UM ERRO===============");
                System.out.println("NOTA: Inserir numeros diferentes entre si!");
                System.out.println("=============> araozinx Dev<===============");
                c++;
            }else if (n1 == n3){
                System.out.println("==============TEMOS UM ERRO===============");
                System.out.println("NOTA: Inserir numeros diferentes entre si!");
                System.out.println("=============> araozinx Dev<===============");
                c++;
            }
        } while (c != 0);
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
        }else{
            menor = n3;
        }

        if(n1 > n2 && n1 < n3){
            medio = n1;
        }else if(n1 < n2 && n1 > n3){
            medio = n1;
        }else if(n2 < n1 && n2 > n3){
            medio = n2;
        }else if(n2 > n1 && n2 < n3){
            medio = n2;
        }else if(n3 < n1){
            medio = n3;
        }else{
            medio = n3;
        }
        System.out.println("==========>OUTPUT<=========");
        System.out.println("==> O Numero Maior: " + maior);
        System.out.println("==> O Numero Medio: " + medio);
        System.out.println("==> O Numero Menor: " + menor);
        System.out.println("Em que ordem deseja fazer a saida dos numeros?");
        System.out.println("Ordem Crescente   [1]");
        System.out.println("Ordem Decrescemte [2]");
        int ordem = sc.nextInt();
        if(ordem == 1){
            System.out.println("=======>ARAOZINX<=============");
            System.out.println("=====> Ordem Crescente <======");
            System.out.println(menor);
            System.out.println(medio);
            System.out.println(maior);
        }else if (ordem == 2){
            System.out.println("==========>ARAOZINX<============");
            System.out.println("=====> Ordem decrescente <======");
            System.out.println(maior);
            System.out.println(medio);
            System.out.println(menor);
        }else{
            System.out.println("==========>ARAOZINX<============");
            System.out.println("============>ERROR<=============");
            System.out.println("NOTA:Digite =>[1] ou [2]<=");
        }
        System.out.println("==========FIM==========");
        System.out.println(" Autor: ARAO SIBINDE JR");
    }
}