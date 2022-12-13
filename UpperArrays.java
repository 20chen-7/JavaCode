import java.util.Scanner;
public class UpperArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[12][12];
        String s = sc.next();
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                mat[i][j] = sc.nextDouble();
                if (i+j < 11){
                    sum += mat[i][j];
                    cnt ++;
                }
            }
        }
        if (s.equals("S"))
            System.out.printf("%.1f", sum);
        else
            System.out.printf("%.1f", sum/cnt);
    }
}
