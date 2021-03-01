class tablicedwuwymiarowe{
    public static void main(String [] args){
        int [] tab = new int[5];
        tab[0] = 40;
        //tab[1] = "Jeden"; //error
        //wyswietlanie elementow tablicy:
        //for(int i=0;i<tab.length;i++){
        //    System.out.println(tab[i]);
        //}
        //commit : Stworzenie tablicy dwuwymiarowej
        int [][] tab2d = new int[5][2];
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        //System.out.prinln(tab2d.length);// XDDD zle
        //System.out.println(tab2d.length*tab2d[0].length);
        for(int i=0;i<tab2d.length;i++){      //wyswietlanie elementow tablicy dwuwymiarowej
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][j]);
            }
            System.out.println("Koniec petli ze zmienna i");
        }
    }
    //metora pierwsza z tablica dwuwymiarowa
    private void static tab2dFirst(){
        int [][] tab2d = new int[5][2];
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        //System.out.prinln(tab2d.length);// XDDD zle
        //System.out.println(tab2d.length*tab2d[0].length);
        for(int i=0;i<tab2d.length;i++){      //wyswietlanie elementow tablicy dwuwymiarowej
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][j]);
            }
            System.out.println("Koniec petli ze zmienna i");
        }
    private void static przypomnienieTabliceJednowymiarowe(){
       int [] tab = new int[5];
        tab[0] = 40;
        //tab[1] = "Jeden"; //error
        //wyswietlanie elementow tablicy:
        for(int i=0;i<tab.length;i++){
            System.out.println(tab[i]);
        }
        //commit : Stworzenie tablicy dwuwymiarowej 
    }    
    }
}