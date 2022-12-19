import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class SimuQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        while (M -- > 0){
            String op = sc.next();
            if (op.equals("push")){
                int x = sc.nextInt();
                que.add(x);
            } else if (op.equals("pop")) {
                que.remove();
            } else if (op.equals("empty")) {
                if (que.isEmpty()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            } else {
                System.out.println(que.peek());
            }
        }
    }
}
