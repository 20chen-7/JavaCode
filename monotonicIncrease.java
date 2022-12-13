import java.util.Scanner;
public class monotonicIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else if (n <= 100 && n >= 1) {
                for (int j = 1; j < n; j++) {
                    System.out.printf("%d ", j);
                }
                System.out.println(n);
            }
        }
//        while (true) {
//            int x = sc.nextInt();
//            if (x == 0) break;
//            for (int i = 0; i<= x; i++) {
//                System.out.printf("%d ", i);
//            }System.out.println(); //empty change the next line
//        }
    }

}
