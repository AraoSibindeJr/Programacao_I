import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double lucro;
        int r, percent;
        do{
            System.out.println(" =====> Banca do Araozinx <=====");
            System.out.println(" ==> Digite o valor de compra: ");
            double vCompra = sc.nextInt();
            if(vCompra < 340){
                lucro = vCompra * 0.45;
                percent = 45;
            }else if(vCompra < 680){
                lucro = vCompra * 0.35;
                percent = 35;
            }else if(vCompra < 1020){
                lucro = vCompra * 0.25;
                percent = 25;
            }else{
                lucro = vCompra * 0.15;
                percent = 15;
            }
            System.out.println(" ===> Valor de compra: " + vCompra +"$");
            System.out.println(" ===> Lucro de compra em Dolares: " + lucro +"$");
            System.out.println(" ===> Lucro de compra em %: " + percent+"%");
            System.out.println(" =====> Banca do Araozinx <=====");
            System.out.println(" ==> Deseja efectuar mais compras?");
            System.out.println(" ==> SIM [1]");
            System.out.println(" ==> NAO [2]");
            r = sc.nextInt();
        }while(r==1);
        System.out.println(" ====> FIM <====");
        System.out.println(" ====> ARAOZINX Dev");






    }
}