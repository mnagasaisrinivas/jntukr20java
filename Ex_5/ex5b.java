class Person {

    String name;
    String gender;
    int age;

    void display(String n, String g, int a) {
        System.out.println(n);
        System.out.println(g);
        System.out.println(a);
    }
    
}

class Student extends Person {

    String branch;
    int id;

    void dis(String b, int i) {
        System.out.println(b);
        System.out.println(i);
    }
}

class Diff extends Student {

    String intrest;

    void di(String i) {
        System.out.println("Intrested in " + i);
    }

}

class ex5b {

    public static void main(String[] ags) {

        Diff x = new Diff();

        x.name = "Naga";
        x.gender = "Male";
        x.age = 18;
        x.branch = "CSM";
        x.id = 64;
        x.intrest = "Programming";

        x.display(x.name, x.gender, x.age);
        x.dis(x.branch, x.id);
        x.di(x.intrest);

    }

}

