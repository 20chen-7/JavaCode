import java.util.Arrays;
import java.util.Scanner;
class Data implements Comparable<Data>{
    int x;
    double y;
    String s;
    public Data(int x, double y, String s){
        this.x = x;
        this.y = y;
        this.s = s;
    }
    public int compareTo(Data t){
        /**x<t, return x */
        return x-t.x;
    }
}
public class TripleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] datas = new Data[n];
        for (int i = 0; i < n; i++){
            datas[i] = new Data(sc.nextInt(), sc.nextDouble(), sc.next());
        }
        Arrays.sort(datas);
        for (Data data: datas){
            System.out.printf("%d %.2f %s\n"), data.x, data.y, data.s);
        }
    }
}
