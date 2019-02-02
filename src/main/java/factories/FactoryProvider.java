package factories;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factory){
        return new DatabaseFactory();
    }
}
