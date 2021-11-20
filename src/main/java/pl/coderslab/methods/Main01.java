package pl.coderslab.methods;

public class Main01 {
    public static int  multiply(int multiplier, int index){
        return multiplier * index;

    }
    public static void main(String[] args) {
        int result = multiply(5,23);
        System.out.println("wynik: " + result);
    }
}
