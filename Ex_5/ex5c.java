abstract class Shapes {

    int len ,width;

    int square(int l) {
        return l*l;
    }

    int rectangle(int l, int w) {
        return l*w;
    }

    double circle(int l) {
        return 3.14*(l*l);
    }

    double triangle(int l, int w) {
        return (0.5 * (l * w));
    }
    
}

class ex5c extends Shapes {

    public static void main(String[] ags) {

        ex5c x = new ex5c();

        x.len = 10;
        x.width = 20;

        System.out.println("Area of Square : " + x.square(x.len));
        System.out.println("Area of Rectangle : " + x.rectangle(x.len, x.width));
        System.out.println("Area of Circle : " + x.circle(x.len));
        System.out.println("Area of Triangle : " + x.triangle(x.len, x.width));

    }

}
