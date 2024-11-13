
public class Main {
    public static void main(String[] args) {
        int Mpar=1,Simp=0;

            System.out.println("=====> SOMA DE IMPARES DE [0] ATE [30]");
            System.out.println("=====> MULTIPLICACAO DE PARES DE [0] ATE [30]");
            for(int i =1; i<=30; i++){
                if(i%2 == 0){
                    System.out.println(" Numero par encontrado: "+ i);
                    Mpar = Mpar * i;
                }else{
                    System.out.println(" Numero impar encontrado: "+ i);
                    Simp = Simp + i;
                }
                System.out.println(" ===================");
                System.out.println(" ===> Soma de impares: " + Simp);
                System.out.println(" ===> Multiplicacao de pares: " + Mpar);

            }
        System.out.println("=====> Fim");
        System.out.println("=====> Araozinx Dev");



    }
}