import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double Vpagar;
        int desc, resp;
        do{
            System.out.println(" =====> Super Mercado <===== ");
            System.out.println(" ===> Digita o nome do Produto:");
            String nome = sc.next();
            System.out.println(" ===> Digita o preco do Produto:");
            double p = sc.nextDouble();
            System.out.println(" ===> Digita a quantidade em unidades:");
            int u = sc.nextInt();
            if(u<10){
                Vpagar = p;
                desc = 0;
            }else if( u < 20){
                Vpagar = p - (p * 0.1);
                desc = 10;
            }else if( u < 50){
                Vpagar = p - (p * 0.2);
                desc = 20;
            }else{
                Vpagar = p - (p * 0.25);
                desc = 25;
            }
            System.out.println(" ===> Produto Comprado: "+ nome);
            System.out.println(" ===> Valor do produto: "+ p);
            System.out.println(" ===> Desconto ganho: "+ desc+"%");
            System.out.println(" ===> Valor a ser pago: "+ Vpagar);
            System.out.println(" =====> Super Mercado <===== ");
            System.out.println(" ===> Deseja efectuar mais compras?");
            System.out.println(" ===> SIM [1]");
            System.out.println(" ===> NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" =====> Volte sempre!");
        System.out.println(" =====> Araozinx Dev");
    }
}