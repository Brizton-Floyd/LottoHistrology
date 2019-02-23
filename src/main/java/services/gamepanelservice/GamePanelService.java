package services.gamepanelservice;

import java.util.Map;

public class GamePanelService {

    private GamePanelRepository gamePanelRepository = new GamePanelRepository();

    public Map<String, String> getGamesAndIds() {
        return gamePanelRepository.retrieveAllGamesAndIds();
    }
}
