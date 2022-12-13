import java.util.Scanner;
public class rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //manhattan distance |x2-x1|+|y2-y1|
        int cx = N/2, cy = N/2;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (Math.abs(i-cx) +Math.abs(j-cy) <= N/2)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }System.out.println();
        }
    }
}
