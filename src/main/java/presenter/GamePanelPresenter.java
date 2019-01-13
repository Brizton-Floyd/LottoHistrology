package presenter;

import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.GamePanelModel;
import ui.GamePanelView;

public final class GamePanelPresenter extends BasePresenter<GamePanelView, GamePanelModel> {

    private Stage primaryStage;
    private HomePresenter homePresenter;

    GamePanelPresenter(Stage primaryStage, HomePresenter homePresenter){
        super(new GamePanelView(), new GamePanelModel());
        this.primaryStage = primaryStage;
        this.homePresenter = homePresenter;
        loadGamePanelStage();
    }

    private void loadGamePanelStage() {
        homePresenter.disableViewContents();

        Stage panelStage = new Stage();
        panelStage.setTitle("Game Panel");
        panelStage.setScene(new Scene(getView()));
        panelStage.show();

        panelStage.setOnHiding(event -> {
            primaryStage.show();
            homePresenter.getView().enableOtherButtons("Lotto Dashboard");
            homePresenter.enableViewContents();
        });
    }

    @Override
    public void onModelChanged(String value) {

    }
}
