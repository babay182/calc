package calc;

public class Preobrazovanie {
    public int iNumber(String a){
        int a1=1;

        if(a.equals("I")){
            a1 = 1;
        }
        else if(a.equals("II")){
            a1 = 2;
        }
        else if(a.equals("III")){
            a1 = 3;
        }
        else if(a.equals("IV")){
            a1 = 4;
        }
        else if(a.equals("V")){
            a1 = 5;
        }
        else if(a.equals("VI")){
            a1 = 6;
        }
        else if(a.equals("VII")){
            a1 = 7;
        }
        else if(a.equals("IIX")){
            a1 = 8;
        }
        else if(a.equals("IX")){
            a1 = 9;
        }
        else if(a.equals("X")){
            a1 = 10;
        }
        else throw new IllegalArgumentException("неверно набрано число");

        return a1;
    }
}
