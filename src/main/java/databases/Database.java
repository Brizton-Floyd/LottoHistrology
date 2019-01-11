package databases;

public interface Database<T> {

    T getDbInstance();

    boolean isConnected();
}
