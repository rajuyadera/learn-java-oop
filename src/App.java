public class App {
    public static void main(String[] args) throws Exception {

        final String myName = "Raju Yadera";

        var person1 = new Person(myName, "bogor");
        person1.sayHello("Aji");

        var person2 = new Person(myName);
        person2.sayHello("parit");
    }
}
