package factories;

public class FactoryProvider {

    public AbstractFactory getFactory(String factory){
        return new DatabaseFactory();
    }
}
