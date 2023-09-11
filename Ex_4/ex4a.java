package Ex_4;

class construct {

    String name;
    String branch;
    int id;

    construct(String str) {
        System.out.println("Single parameter constructor is called");
        name = str;
    } 

    construct(String str, String br) {
        System.out.println("Double parameter constructor is called");
        name = str;
        branch = br;
    } 

    construct(String str, String br, int i) {
        System.out.println("Triple parameter constructor is called");
        name = str;
        branch = br;
        id = i;
    }    


    
}

class main{

    public static void main(String[] ags) {

        construct x = new construct("Naga");
        construct y = new construct("Naga", "CSM");
        construct z = new construct("Naga", "CSM", 64);
        
        System.out.println("My self " + x.name );
        System.out.println("My self " + y.name + " from " + y.branch +" branch");
        System.out.println("My self " + z.name + " from " + z.branch +" branch of id " + z.id);


    }


}