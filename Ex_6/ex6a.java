class Person {

    String name;
    String gender;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
    
}

class Student extends Person {

    String branch;
    int id;

    
    @Override void display() {
        System.out.println(branch);
        System.out.println(id);
    }


}

class ex6a {

	public static void main(String[] ags) {
		Student s = new Student();

		s.name = "Naga";
		s.gender = "Male";
		s.age = 18;
		s.branch = "CSM";
		s.id = 64 ;

		s.display();
		
	}	
}