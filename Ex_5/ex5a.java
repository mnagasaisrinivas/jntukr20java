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

class ex5a {

    public static void main(String[] ags) {

        Student x = new Student();

        x.name = "Naga";
        x.gender = "Male";
        x.age = 18;

        x.branch = "CSM";
        x.id = 64;

        x.display(x.name, x.gender, x.age);
        x.dis(x.branch, x.id);


    }
}
