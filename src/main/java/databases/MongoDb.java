package databases;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import java.net.UnknownHostException;

public class MongoDb implements Database<DB> {

    private MongoClient mongoClient;

    public MongoDb(){
        try {
            this.mongoClient = new MongoClient("localhost",27017);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public MongoClient getClient(){
        return this.mongoClient;
    }

    @Override
    public DB getDbInstance() {
        return mongoClient.getDB("lotterygamedb");
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}
