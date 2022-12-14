import java.util.Scanner;
public class LongestPost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int N = sc.nextInt();
            if (N == 0) break;
            String[] strs = new String[N];
            for (int i = 0; i < N; i++){
                strs[i] = sc.next();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= strs[0].length(); i++){
                char c = strs[0].charAt(strs[0].length()-i);
                boolean flag = true;
                for (int j = 1; j < N; j++){
                    if (i > strs[j].length() || strs[j].charAt(strs[j].length()-i) != c){
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    sb.append(c);
                else break;
            }sb.reverse();
            System.out.println(sb);
        }
    }
}
