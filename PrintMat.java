import java.util.Scanner;
public class PrintMat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                mat[i][j] = sc.nextInt();
            }
        }print2D(mat, row, col);

    }
    private static void print2D(int[][] a, int row, int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
