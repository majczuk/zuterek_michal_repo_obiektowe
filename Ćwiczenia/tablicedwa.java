class tablicedwa{
    public static void main(String [] a){
        int [][] tab2d = new int [2][2];
        tab2d [0][0] = 1;
        tab2d [0][1] = 2;
        tab2d [1][0] = 3;
        tab2d [1][1] = 4;
        for(int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
            System.out.println(tab2d[i][j]);
            }
        }
    }
    private static void tablicaTabliczkaMnozenia(){
        int [][] tab2d = new int [10][10];
        //Wypelnienie tablicy
        for(int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                tab2d[i][j] = (i+1)*(j+1);
            }
        }
        for(int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
            System.out.println(tab2d[i][j]+"\t");
            }
            System.out.println();
        }
    }

}