
import java.util.Scanner;
public class MaxTwoValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(max(a, b));
    }
    private static int max(int a, int b){
        if (a > b) return a;
        return b;
    }
}
