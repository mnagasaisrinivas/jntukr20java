package Ex_3;

class ex3b {

    String name ;
    String branch ;
    int id ;

    ex3b() {

        System.out.println("Constructor is called :");
        name = "Naga";
        branch = "CSM";
        id = 64;



    }

    
}

class main{


    public static void main(String[] ags) {

        ex3b s = new ex3b();

        System.out.println(s.name);
        System.out.println(s.branch);
        System.out.println(s.id);



    }
}
