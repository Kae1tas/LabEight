public class main {
    public static void main(String[] args) {
        People boris = new People("Boris", "Borisov", 23);
        Student keskil = new Student("Keskil", "Maximov", 20);
        Teacher bill = new Teacher("Bill", "Gates", 40);

        boris.walk();
        boris.voice();
        boris.run();
        keskil.walk();
        keskil.voice();
        keskil.run();
        keskil.learn();
        bill.walk();
        bill.teach();
    }
}
