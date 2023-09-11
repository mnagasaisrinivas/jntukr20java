package Ex_4;

class main {

    int height, width, length;

    public double vol() {
        return 0;
    }

    public double vol(int l) {
        return l*l*l;
    }

    public double vol(int l, int h, int w) {
        return l*h*w;
    }
    
}

class ex4b {

    public static void main(String[] ags) {

        main x = new main();
        main y = new main();
        main z = new main();

        System.out.println(x.vol());

        y.length = 10;
        System.out.println("Volume of the cube is :" + y.vol(y.length) );

        z.length = 5;
        z.height = 10;
        z.width = 15;
        System.out.println("Voulume calculated by the given dimensions is : " + z.vol(z.length, z.height, z.width) );



    }

}
