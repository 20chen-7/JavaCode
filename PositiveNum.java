import java.util.Scanner;
public class PositiveNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 6; i++){
            double n = sc.nextDouble();
            if (n>=0 && n <= 100){
                cnt++;
            }
        }System.out.printf("%d positive numbers", cnt);
    }
}
