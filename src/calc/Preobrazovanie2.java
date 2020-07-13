package calc;

public class Preobrazovanie2 {
    public String iString(int a){
        String a1="";
        while (a<0){
            a1 += "-";
            a = 0-a;
        }while (a >= 100){
            a1 += "C";
            a -= 100;
        }while (a >= 90){
            a1 += "XC";
            a -= 90;
        }while (a >= 50){
            a1 += "L";
            a -= 50;
        }while (a >= 40){
            a1 += "XL";
            a -= 40;
        }while (a >= 10){
            a1 += "X";
            a -= 10;
        }while (a >= 9){
            a1 += "IX";
            a -= 9;
        }
        while (a >= 5) {
            a1 += "V";
            a -= 5;
        }
        while (a >= 4) {
            a1 += "IV";
            a -= 4;
        }
        while (a >= 1) {
            a1 += "I";
            a -= 1;
        }
        return a1;
    }
}
