package pl.coderslab.methods;

public class Main03 {
//W pliku Main03.java napisz publiczną metodę convertToUsd, która przyjmuje parametr pln, czyli kwotę w złotówkach. Metoda ma zwrócić podaną kwotę w dolarach amerykańskich.
//
//Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.
    public double convertToUsd(double PLN){
        return PLN / 4.04;
    }
    public static void main(String[] args) {
        double result1 = new Main03().convertToUsd(25000);
        System.out.println("wynik = " + result1 + " USD");
    }
}
