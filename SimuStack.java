import java.util.Scanner;
import java.util.Stack;

public class SimuStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < M; i++){
            String op = sc.next();
            if (op.equals("push")){
                int x = sc.nextInt();
                stk.push(x);
            } else if (op.equals("pop")) {
                stk.pop();
            } else if (op.equals("empty")) {
                if (stk.empty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                System.out.println(stk.peek());
            }
        }
    }
}

