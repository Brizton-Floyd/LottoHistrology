package services.dashboardservice;

import com.mongodb.*;
import constants.URLs;
import databases.Database;
import databases.MongoDb;
import factories.AbstractFactory;
import factories.FactoryProvider;
import model.lottogamemodels.DrawResult;
import model.lottogamemodels.LotteryGame;
import utilities.LottoURLProcessor;
import utilities.URLProcessor;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLOutput;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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

    List<DrawResult> getDrawResults() {

        List<DrawResult> drawResults = new ArrayList<>();

        final DBCollection collection = database.getCollection("results");
        DBCursor results = collection.find(new BasicDBObject("gameName", lotteryGame));

        if(results.size() == 0){
            final Optional<URLs> first = Stream.of(URLs.values()).filter(url -> url.getGameName().equals(lotteryGame)).findFirst();
            final String url = (first.isPresent()) ? first.get().getUrl() : "";
            URLProcessor<List<DrawResult>> processor = new LottoURLProcessor();
            List<DrawResult> results1;

            try {
                results1 = processor.process(new URL(url));
                //insertData(results1, lotteryGame);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Result " + results.size());
        return drawResults;
    }

    private void insertData(List<DrawResult> drawResults, String lotteryGame) {
        final DBCollection collection = database.getCollection("results");

        for(DrawResult drawResult : drawResults) {
            BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();

            docBuilder.append("gameName", lotteryGame);
            docBuilder.append("drawResult", drawResult.getDrawResult());

            Instant instant = drawResult.getDrawDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
            docBuilder.append("drawDate", Date.from(instant));
            docBuilder.append("drawNumber", drawResult.getDrawNumber());

            if(Integer.parseInt(drawResult.getBonusNumber()) > 0){
                docBuilder.append("bonusNumber", drawResult.getBonusNumber());
            }

            collection.insert(docBuilder.get());
        }
    }
}
