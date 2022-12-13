import java.util.Scanner;
public class Divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i < Math.sqrt(N); i++){
            if (N%i == 0){
                System.out.println(i);
            }
        }
    }
}
