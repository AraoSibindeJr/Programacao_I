import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double v[] = new double[10];
        double negativos = 0;
        double positivos =0;
        for(int i =0; i < v.length; i++){
            System.out.println("Posicao:"+ i);
            v[i]=sc.nextDouble();
        }
        for(int i =0; i < v.length;i++){
            if(v[i] < 0){
                negativos++;
            }else{
                positivos = positivos + v[i];
            }
        }
        System.out.println("Quantidade de negativos: "+ negativos);
        System.out.println("Soma de positivos: "+ positivos);
    }
}