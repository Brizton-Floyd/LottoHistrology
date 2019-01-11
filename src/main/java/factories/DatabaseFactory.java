package factories;

import databases.Database;
import databases.MongoDb;

public class DatabaseFactory implements AbstractFactory<Database> {

    @Override
    public Database create(String dbChoice) {
        switch (dbChoice){
            case "Mongo":
                return new MongoDb();
            case "MySql":
                return null;
            case "SqlLit":
                return null;
                default:
                    return null;
        }
    }
}
