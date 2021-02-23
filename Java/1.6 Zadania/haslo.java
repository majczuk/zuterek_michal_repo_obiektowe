import java.util.Scanner;

class haslo{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        final String haslo = "programowanie";
        String haslo2 = sc.next();

        if (haslo.equals(haslo2)){
            System.out.println("Poprawne haslo");
        } else {
            System.out.println("Błędne haslo");
        }
    }
}