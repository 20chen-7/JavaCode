import java.util.Scanner;
public class SquareMatrix {
    public static void main(String[] args){
        // dist to boundaries, choose minimum
        Scanner sc = new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if (N == 0) break;
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    int curr = Math.min(i, N-i-1);
                    curr = Math.min(curr, j);
                    curr = Math.min(curr, N-j-1);
                    System.out.printf("%d ", curr+1);
                }
                System.out.println();
            }
        }
    }
}
