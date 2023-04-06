package factory;

public class FactoryClass {
    public Interface getInterface(String interfaceType) {
        if (interfaceType ==null) return null;
        if (interfaceType.equalsIgnoreCase("CLASSone")) {
            return new Class1();
        } else if (interfaceType.equalsIgnoreCase("CLASStwo")) {
            return new Class2();
        } else if (interfaceType.equalsIgnoreCase("CLASSthree")) {
            return new Class3();
        }
        return null;
    }
}
