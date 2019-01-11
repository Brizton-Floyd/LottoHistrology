package databases;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class MongoDb implements Database<MongoDatabase> {

    @Override
    public MongoDatabase getDbInstance() {
        return null;
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}
