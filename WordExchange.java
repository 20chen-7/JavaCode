import java.util.Scanner;
public class WordExchange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String a = sc.next();
        String b = sc.next();
        for (String str: s){
            if (str.equals(a))
                System.out.printf("%s ", b);
            else
                System.out.printf("%s ", str);
        }
    }
}
