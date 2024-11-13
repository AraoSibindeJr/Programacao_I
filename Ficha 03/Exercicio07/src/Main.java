import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double desc;
        int totcar=0,  resp,car =0,totp =0;

        do{
            System.out.println(" =======> Dream Cars Araozinx <======= ");
            System.out.println(" ===> Digite o ano de fabrico do carro: ");
            int ano = sc.nextInt();
            System.out.println(" ===> Preco do carro: ");
            double price = sc.nextInt();
            if(ano<=2000){
                desc = price*0.12;
                price = price - desc;
                totcar++;
                System.out.println(" ===> Desconto concebido: "+ desc+ "$" );
                System.out.println(" ===> Valor a pagar: " + price+"$");
                System.out.println(" =====> & <=====> & <=====> ");
            }else {
                desc = price*0.07;
                price = price - desc;
                System.out.println(" ===> Desconto concebido: "+ desc+ "$" );
                System.out.println(" ===> Valor a pagar: " + price+"$");
                System.out.println(" =====> & <=====> & <=====> ");
            }
            totp += price;
            car++;
            System.out.println(" ===> Deseja fazer mais compras?");
            System.out.println(" ==> SIM [1]");
            System.out.println(" ==> NAO [2]");
            resp = sc.nextInt();
        }while(resp != 2);
        System.out.println(" ===> Resultados das vendas:");
        System.out.println(" ===> Total de carros: "+ car);
        System.out.println(" ===> Total de carros antes do ano [2000]: "+ totcar);
        System.out.println(" ===> Preco total a pagar: "+ totp+ "$");
        System.out.println(" =======> Dream Cars Araozinx <======= ");
        System.out.println(" =======> Araozinx Dev!");
    }
}