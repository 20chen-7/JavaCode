import java.util.Scanner;
public class RowInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String c = sc.next();
        double[][] mat = new double[12][12];
        double sum = 0;
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++) {
                double n = sc.nextDouble();
                mat[i][j] = n;
                if (i == L) {
                    sum += mat[L][j];
                }
            }
        }
        if (c.equals("S"))
            System.out.printf("%.1f", sum);
        else
            System.out.printf("%.1f", sum/12);

    }
}
