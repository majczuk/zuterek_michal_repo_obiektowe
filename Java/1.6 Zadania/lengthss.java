import java.util.Scanner;

class lengthss{
    public static void main(String []arg){

        Scanner sc=new Scanner(System.in);

        System.out.println("Podaj linijke tekstu");

        String tekst=sc.nextLine();
        int liczba=tekst.length();

        System.out.println("Dlugos tekstu wynosi: "+liczba);
    }
}