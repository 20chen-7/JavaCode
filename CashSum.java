import java.util.Scanner;
public class CashSum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] money = {100,50,20,10,5,2,1};
        System.out.println(n);
        for (int x: money){
            System.out.printf("%d nota(s) de R$ %d,00\n", n/x, x);
            n %= x;
        }
    }
}
