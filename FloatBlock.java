import java.util.Scanner;
public class FloatBlock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        String res;
        if (n <0 || n > 100)
            res = "Fora de intervalo";
        else if(n >=0 && n<= 25)
            res = "Intervalo [0,25]";
        else if(n<= 50)
            res = "Intervalo (25,50]";
        else if(n<= 75)
            res = "Intervalo (50,75]";
        else res = "Intervalo (75,100]";
        System.out.println(res);
    }
}
