import java.util.Random;
class MichalZuterek{
    public static void main (String[] args){

        Sprawdzian spr=new Sprawdzian("2021-04-07",4,"PROGRAMOWANIE OBIEKTOWE");
        System.out.println(spr.data+" "+spr.ocena+" "+spr.nazwa);
        
        Dane dn = new Dane("Michal","Zuterek","2008-08-30");
        System.out.println(dn);
    }
}