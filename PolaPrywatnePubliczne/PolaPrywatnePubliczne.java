PolaPrywatnePubliczne.java
class PolaPrywatnePubliczne{
    static DaneOsobowe dos;
    
    public static void main(String [] args){
        dos = new DaneOsobowe();
        System.out.println("1 os BMI: "+dos.mybmi());
        dos.wzrost = 192;
        dos.waga = 94;
        System.out.println("2 os BMI: "+dos.mybmi());
    }
}