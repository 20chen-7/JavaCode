import java.util.Scanner;
public class SnakeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];
        //direction west, north, east, south
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1;
        for (int i = 1; i<= n*m; i++){
            mat[x][y] = i;
            int a = x+dx[d], b = y+dy[d];
            //out of boundary, or collison
            if (a<0 || a>= n || b<0 || b >=m||mat[a][b] > 0){
                d = (d+1)%4;
                a = x+dx[d];
                b = y+dy[d];
            }
            x = a;
            y = b ;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("%d ", mat[i][j]);
            }System.out.println();
        }
    }
}
