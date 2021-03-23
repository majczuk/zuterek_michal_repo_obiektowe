class DaneOsobowe{
    private String pesel = "12345678910";
    public int wiek = 20;
    public int wzrost = 177;
    public int waga = 88;
    
    public double mybmi(){
        System.out.println("Osoba o peseslu "+pesel);
        return waga/((double)wzrost/100*(double)wzrost/100);
    }
}