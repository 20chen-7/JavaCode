import java.util.Scanner;
public class Snacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int n = sc.nextInt();
        double[] prices = {4.00, 4.50, 5.00, 2.00, 1.50};
        System.out.printf("Total: R$ %.2f\n", (n*prices[type-1]));
    }
}
