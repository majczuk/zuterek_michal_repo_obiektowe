import java.util.Random;
import java.util.Scanner;
import java.io*;

class tablice{
    public static void main(String[] args){

        String uczniowie[] = new String[10];
        int ocena[] = new int[10];
        int i;
        for(i=0; i<10; i++){
            oceny[i] = (int)(Math.random()6+1);
        }
           
        i = 0;
        try{
            Scanner sc = new Scanner(new File("uczniowie.txt"));
            while(sc.hasNext()){
                uczniowie[i] = sc.nextLine();
                i++;
            }
        }catch (FileNotFoundException ex){
            System.out.println("błąd "+ex.toString());
        }

        for(i=0; i<10; i++){
            System.out.println(uczniowie[i] +" "+  ocena[i]);
        }
    }
}