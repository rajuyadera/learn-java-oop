public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    // Constructor
    Person(String paramName){
        this(paramName, null);
    }

    // Function / Method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " My name is " + name);
    }
}
