import java.util.Scanner;
public class ABMinusCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();
        System.out.printf("DIFERENCA = %d/n", a * b - d * c);
    }
}
