class main {

    String name ;
    String branch ;
    int id ;

    main() {

        System.out.println("Constructor is called :");
        name = "Naga";
        branch = "CSM";
        id = 64;



    }

    
}

class ex3b{


    public static void main(String[] ags) {

        main s = new main();

        System.out.println(s.name);
        System.out.println(s.branch);
        System.out.println(s.id);



    }
}
