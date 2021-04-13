class Triangle{

    public Triangle(int wysokosc, int podstawa){
        System.out.println(wysokosc*podstawa/2);
    }

    public Triangle(int wysokosc, int podstawa, int c, int h){
        System.out.println(wysokosc*podstawa/2);
        System.out.println(c*h/2);
    }

    public Triangle(int a, int b, int c, int h){
        System.out.println(2/a*h);
        System.out.println(2/b*h);
        System.out.println(2/c*h);
    }
}
