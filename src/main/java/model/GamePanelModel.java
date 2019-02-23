package model;

import java.util.*;

public class GamePanelModel extends ModelBase {

    private Map<String, String> gameAndIdMap;

    public GamePanelModel(){ }

    public void addGamesAndIdsToMap(Map<String, String> gameAndIdMap){
        this.gameAndIdMap = gameAndIdMap;
    }

    public String gameId (String gameName){
        return this.gameAndIdMap.get( gameName );
    }

    public Set<String> getGameNameSet() {
        return gameAndIdMap.keySet();
    }
}
