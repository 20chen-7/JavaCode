import java.util.Scanner;

public class OccurOneChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //if contain space used next line else use next() both ok
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++){
            int t = s.charAt(i) - 'a';
            arr[t] ++;
        }
        for (int i = 0; i < s.length(); i++){
            int t = s.charAt(i) - 'a';
            if (arr[t] == 1){
                System.out.print(s.charAt(i));
                return;
            }
        }System.out.print("no");
    }
}
