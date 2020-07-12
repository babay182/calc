package calc;
import java.util.Scanner;

public class Vvod {
    int a1,b1,rez;
    public String Scanner(){
        Scanner covsole = new Scanner(System.in);
        String a = covsole.next();
        String z = covsole.next();
        String b = covsole.next();
        if(a.matches("[-+]?\\d+") && b.matches("[-+]?\\d+")){
            a1 = Integer.parseInt(a);
            b1 = Integer.parseInt(b);
        } else {
            Preobrazovanie p = new Preobrazovanie();
            a1 = p.iNumber(a);
            b1 = p.iNumber(b);
        }if(a1>0&&a1<11&&b1>0&&b1<11) {
            if (z.equals("+")) {
                rez = a1 + b1;
            } else if (z.equals("-")) {
                rez = a1 - b1;
            } else if (z.equals("*")) {
                rez = a1 * b1;
            } else if (z.equals("/")) {
                rez = a1 / b1;
            } else {
                throw new IllegalArgumentException("введено неверное действие");
            }
        }else throw new IllegalArgumentException("число не входит в разрешенный диапазон");
        String rez2;
        if(a.matches("[-+]?\\d+") && b.matches("[-+]?\\d+")){
            rez2=String.valueOf(rez);

        } else {
            Preobrazovanie2 p = new Preobrazovanie2();
            rez2 = p.iString(rez);
        }
        return rez2;
    }


    public static void main(String[] args) {
        Vvod n = new Vvod();

        System.out.println(n.Scanner());

    }
}
