//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    import java.util.Random;
    import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10)+1;
        int b = random.nextInt(-10,10);
        int c = random.nextInt(-10,10);
        System.out.println("Os valores das constantes da equacao:");
        System.out.println(" a: "+ a);
        System.out.println(" b: "+ b);
        System.out.println(" c: "+ c);
        double delta = (b*b - 4 * a * c);
        System.out.println("Valor de Dealta:" + delta);
        double r1 = (-b + sqrt(delta))/2 * a;
        double r2 = (-b - sqrt(delta))/2 * a;
        if ( delta < 0){
            System.out.println("As raizes serao complexas.");
            System.out.println("Raiz 01: "+ r1);
            System.out.println("Raiz 02: "+ r2);
        }else if( delta == 0){
            System.out.println("As raizes tem mesmo valor, sao iguais.");
            System.out.println("Raiz 01: "+ r1);
            System.out.println("Raiz 02: "+ r2);
            
        }else{
            System.out.println("Teremos duas raizes distintas.");
            System.out.println("Raiz 01: "+ r1);
            System.out.println("Raiz 02: "+ r2);
        }
    }
}
