package presenter;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.GamePanelModel;
import services.gamepanelservice.GamePanelService;
import ui.GamePanelView;

import java.util.Map;
import java.util.Set;

public final class GamePanelPresenter extends BasePresenter<GamePanelView, GamePanelModel> {

    private Stage primaryStage;
    private HomePresenter homePresenter;
    private Stage panelStage = new Stage();

    GamePanelPresenter(Stage primaryStage, HomePresenter homePresenter){
        super(new GamePanelView(), new GamePanelModel());
        this.primaryStage = primaryStage;
        this.homePresenter = homePresenter;
        getView().setPresenter( (this) );
        loadAllLotteryGames();
        getView().setUpUi();
        loadGamePanelStage();
    }

    @Override
    public <T extends String> void onModelChanged(T value) {
        panelStage.close();
        homePresenter.enableViewContents();
        this.homePresenter.loadNewGame( value );
    }

    private void loadAllLotteryGames() {
        Map<String,String> gameAndIdMap = new GamePanelService().getGamesAndIds();
        getModel().addGamesAndIdsToMap( gameAndIdMap );
    }

    public Set<String> getGameNames(){
        return getModel().getGameNameSet();
    }

    private void loadGamePanelStage() {
        homePresenter.disableViewContents();

        panelStage.setTitle("Game Panel");
        panelStage.setScene(new Scene(getView()));
        panelStage.show();

        panelStage.setOnHiding(event -> {
            primaryStage.show();
            homePresenter.getView().enablePanelButton();
            homePresenter.enableViewContents();
        });
    }

}
