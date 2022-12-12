import java.util.Scanner;
public class GameBlock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int res = b-a;
        if (res <= 0)
            res += 24;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", res);
    }
}
