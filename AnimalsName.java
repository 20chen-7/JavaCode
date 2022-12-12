import java.util.Scanner;
public class AnimalsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        String b = sc.next();
        String res;
        if (s.equals("vertebrado")) {
            if (a.equals("ave")) {
                if (b.equals("carnivoro"))
                    res = "aguia";
                else res = "pomba";
            } else {
                if (b.equals("onivoro"))
                    res = "homem";
                else res = "vaca";
            }
        } else {
            if (a.equals("inseto")) {
                if (b.equals("hematofago"))
                    res = "pulga";
                else res = "lagarta";
            } else {
                if (b.equals("hematofago"))
                    res = "sanguessuga";
                else res = "minhoca";
            }
        }
        System.out.println(res);
    }
}
