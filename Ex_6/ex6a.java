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

    @overide
    void display(String b, int i) {
        System.out.println(b);
        System.out.println(i);
    }


}

class ex6a {

    Student s = new Student();

    s.name = "Naga";
    s.gender = "Male";
    s.age = 18;
    s.branch = "CSM";
    s.id = 64 ;

    s.display(s.branch, s.id);
}
