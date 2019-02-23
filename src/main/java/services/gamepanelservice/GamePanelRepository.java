package services.gamepanelservice;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import databases.MongoDb;
import factories.AbstractFactory;
import factories.FactoryProvider;

import java.util.LinkedHashMap;
import java.util.Map;

class GamePanelRepository {

    private MongoDb database;

    GamePanelRepository(){
        AbstractFactory factory = FactoryProvider.getFactory("Database");
        database = (MongoDb) factory.create("Mongo");
    }
    
    Map<String, String> retrieveAllGamesAndIds() {

        Map<String, String> data = new LinkedHashMap<>();

        final DB lotteryGames = database.getClient().getDB("game_names");
        final DBCollection names_ids = lotteryGames.getCollection("names_ids");

        DBCursor cursor = names_ids.find();
        while (cursor.hasNext()){
            DBObject obj = cursor.next();
            data.put(obj.get("Name").toString(), obj.get("_id").toString());

        }

        return data;
    }
}
