import java.util.Scanner;
import static java.lang.Math.*;
 
 class bmi {
 
    static Scanner userInput = new Scanner(System.in);
 
    public static void main(String[] args){

        System.out.print("Podaj swoje imie: ");

        String imie = userInput.next();

        System.out.print("Podaj swoje nazwisko: ");

        String nazwisko = userInput.next();

        System.out.print("Podaj swoj wiek: ");

        int wiek = userInput.nextInt();
 
        System.out.print("Podaj swoj wzrost: ");
 
        double wzrost = userInput.nextDouble();
 
        System.out.print("Podaj swoja mase ciala: ");
 
        double masa = userInput.nextDouble();
 
        double bmi = masa/Math.pow(wzrost, 2);

        double wynik = Math.round(bmi*100000.0)/100000.0;
 
        System.out.print("Twoje BMI wynosi: "+wynik);
    }
 
 
}