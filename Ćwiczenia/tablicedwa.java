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

}