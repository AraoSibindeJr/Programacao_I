
public class Main {
    public static void main(String[] args) {
        int a=0, b=1,c;
        System.out.println(" =====> Sequencia de Fibonacci <===== ");
        System.out.println(" =====> Primeiros [10] Numeros: ");
        System.out.println(" ===> INICIO:");
        c = a + b;
        for (int i =0; i<=10; i++){
            System.out.println(" ==> "+ c);
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println(" =====> FIM");
        System.out.println(" =====> Araozinx Dev");
    }
}