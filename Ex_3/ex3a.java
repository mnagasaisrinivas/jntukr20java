class Student{

    int id;
    String name;
    String branch;

    void display(int id, String name, String branch) {

        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);

    }

    
}

class ex3a {

    public static void main(String[] ags) {

        Student s = new Student();

        s.name = "Naga";
        s.id = 64;
        s.branch = "CSM";

        s.display(s.id, s.name, s.branch);
    }
}