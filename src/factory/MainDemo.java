package factory;

public class MainDemo {
    public static void main(String[] args) {
        FactoryClass factoryClass = new FactoryClass();
        Interface interface1 = factoryClass.getInterface("CLASSONE");
        interface1.method();

        Interface interface2 = factoryClass.getInterface("CLASSTWO");
        interface2.method();

        Interface interface3 = factoryClass.getInterface("CLASSTHREE");
        interface3.method();

    }
}
