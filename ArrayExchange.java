import java.util.Scanner;
public class ArrayExchange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if (n<=0)
                System.out.printf("X[%d] = %d\n", i, 1);
            else
                System.out.printf("X[%d] = %d\n", i, n);
        }
//        int[] x = new int[10];
//        for (int i = 0; i < 10; i++ ){
//            x[i] = sc.nextInt();
//            if (x[i] <= 0) x[i] = 1;
//        }
//        for (int i = 0; i < 10; i++ ){
//            System.out.printf("X[%d] = %d\n", i, x[i]);
//        }
    }
}
