public class Teacher extends People {
    Teacher(String name, String lastname, int age) {
        super(name, lastname, age);
    }
    public static void teach() {
        System.out.println("teach");
    }
}
