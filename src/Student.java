public class Student extends People{
    Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public static void learn() {
        System.out.println("learn");
    }
}
