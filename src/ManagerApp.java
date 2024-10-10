public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Raju";
        manager.sayHello("Aji");

        var vicePresident = new VicePresident();
        // yield name and function sayHello from Class Manager (Inheritance)
        vicePresident.name = "Alya";
        vicePresident.sayHello("Parit");
    }
}
