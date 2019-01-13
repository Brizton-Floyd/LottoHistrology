package ui;

import presenter.GamePanelPresenter;

public class GamePanelView extends BaseView<GamePanelPresenter> {

    public GamePanelView(){
        setPrefWidth(500.0);
        setPrefHeight(700.0);
        setStyle("-fx-background-color:beige");
    }
    @Override
    public void setUpUi() {

    }
}
