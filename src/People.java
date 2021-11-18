public class People {
    protected String name;
    protected String lastname;
    protected int age;

    People(){
        this.name = "no name";
        this.lastname = "no lastname";
        this.age = 0;
    }

    People(String name, String lastname, int age){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    static void walk() {
        System.out.println("walk");
    }
    static void voice() {
        System.out.println("voice");
    }
    static void run() {
        System.out.println("run");
    }
}


