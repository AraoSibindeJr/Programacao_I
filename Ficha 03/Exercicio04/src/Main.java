public class Main{
    public static void main (String []args){
        System.out.println(" =====> Factoriais de [1] ate [10] <===== ");
        for (int i = 1; i <= 10; i++){
            long fac = 1;
            for(int j=1; j<=i; j++){
                fac = fac * j;
            }
            System.out.println(" =====> Factorial de [" + i +"]");
            System.out.println(" =====> "+fac);
        }
    }
}
