package model;

import java.util.*;

public class GamePanelModel extends ModelBase {

    private Map<String, Integer> gameAndIdMap;

    public GamePanelModel(){ gameAndIdMap = new HashMap<>();}

    public void addGamesAndIdsToMap(String gameName, int id){
        this.gameAndIdMap.put( gameName, id);
    }

    public int gameId (String gameName){
        return this.gameAndIdMap.get( gameName );
    }
}
