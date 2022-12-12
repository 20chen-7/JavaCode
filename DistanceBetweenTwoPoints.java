import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double dx = x1 - x2;
        double dy = y1 - y2;
        System.out.printf("%.4f\n", Math.sqrt(dx * dx + dy * dy));
    }
}

