package services.dashboardservice;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import databases.Database;
import databases.MongoDb;
import factories.AbstractFactory;
import factories.FactoryProvider;
import model.lottogamemodels.DrawResult;
import model.lottogamemodels.LotteryGame;

@SuppressWarnings("unchecked")
public class LottoDashboardRepository {

    private String lotteryGame;
    private DB database;

    LottoDashboardRepository(String lotteryGame) {
        this.lotteryGame = lotteryGame;
        AbstractFactory<Database> databaseAbstractFactory = FactoryProvider.getFactory("");
        MongoDb mongoDatabaseDatabase = (MongoDb) databaseAbstractFactory.create("Mongo");
         this.database = ((MongoDb) databaseAbstractFactory.create("Mongo")).getDbInstance();
    }

    DrawResult getDrawResults() {

        DrawResult drawResult = new DrawResult();

        final DBCollection collection = database.getCollection("results");
        DBCursor results = collection.find(new BasicDBObject("name", lotteryGame));

        return null;
    }
}
