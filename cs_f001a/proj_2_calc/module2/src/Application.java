/*public class HelloWorld {
    public static void main(String[] args) throws Exception {
        hello();
        world french = new world();
        french.greetings();
    }

    public static void hello() {
        System.out.println("Hello world");
    }
}*/

public class Application {
    public static void main(String[] args) {
        
            System.out.println("Hello World!");
            
            Person persons = new Person();
            persons.name();
    }

}
class Person {
    public void name() {
        System.out.println("Bobby");
    }
}