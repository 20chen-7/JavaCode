import java.util.Scanner;
public class BiggestDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    private static int gcd(int a, int b){
//        int m = Math.max(a, b);
//        for (int i = m ; i >= 1; i--){
//            if (a%i == 0 && b%i == 0){
//                return i;
//            }
//        }return 0;
        return b != 0? gcd(b, a%b):a; //Euclidean algor
    }
}
