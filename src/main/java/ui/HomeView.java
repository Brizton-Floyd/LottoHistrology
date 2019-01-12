package ui;

import com.jfoenix.controls.JFXButton;
import constants.EventSource;
import helpers.ButtonHelper;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import presenter.HomePresenter;

import java.util.*;

public class HomeView extends BaseView{

    private StackPane viewStackPane;

    public HomeView(){
        setPrefWidth(1432);
        setPrefHeight(753);
        viewStackPane = new StackPane();
        viewStackPane.setId("2");
        viewStackPane.setStyle("-fx-background-color:red");
    }

    @Override
    public void setUpUi() {
        createButtonPane();
        positionViewPaneOnCanvas();
        buildButtons();
    }

    public void injectView(Pane viewPane) {
        viewStackPane.getChildren().setAll(viewPane);
    }
    private void buildButtons() {

        VBox buttonVbox = (VBox) lookup("#1");

        Map<String,String> buttonAndGlyphNames = new LinkedHashMap<>();
        buttonAndGlyphNames.put("Lotto Dashboard","VIEW_DASHBOARD");
        buttonAndGlyphNames.put("Bet Slip Analysis","TRENDING_UP");
        buttonAndGlyphNames.put("Game Out Chart","TRENDING_UP");
        buttonAndGlyphNames.put("Lottery Number Gaps","CHART_LINE");
        buttonAndGlyphNames.put("Companion Numbers","TRENDING_NEUTRAL");
        buttonAndGlyphNames.put("Position Sequence Chart","RAY_START_END");
        buttonAndGlyphNames.put("Multiple Chart","TRENDING_UP");
        buttonAndGlyphNames.put("Gap Spacing Chart","TRENDING_UP");
        buttonAndGlyphNames.put("Load Game Panel","TRENDING_UP");

        List<JFXButton> gameOutBtns = ButtonHelper.buildButtonList( buttonAndGlyphNames, buttonVbox.getPrefWidth() );
        placeActionOnButton( gameOutBtns );
        buttonVbox.getChildren().setAll( gameOutBtns );

    }
    private void placeActionOnButton(List<JFXButton> gameOutBtns) {

        for(JFXButton jfxButton : gameOutBtns){

            jfxButton.setOnAction( e -> {

                jfxButton.setDisable(true);
                enableOtherButtons( gameOutBtns, jfxButton.getText());

                EventSource eventSource = Arrays.stream(EventSource.values()).filter(ee -> ee.getText().equals( jfxButton.getText() ))
                        .findFirst().orElse(null);
                ((HomePresenter)getPresenter()).handleViewEvent(eventSource);

            });

        }
    }

    private void enableOtherButtons(List<JFXButton> gameOutBtns, String name) {
        gameOutBtns.forEach( button -> {
            if(button.isDisabled() && !button.getText().equals(name)){
                button.setDisable(false);
            }
        });
    }

    private void positionViewPaneOnCanvas() {

        AnchorPane.setRightAnchor(viewStackPane,0.0);
        AnchorPane.setTopAnchor(viewStackPane,0.0);
        AnchorPane.setBottomAnchor(viewStackPane,0.0);
        AnchorPane.setLeftAnchor(viewStackPane,200.0);

        getChildren().add(viewStackPane);
    }

    private void createButtonPane(){
        VBox buttonVBox = new VBox();
        buttonVBox.setId("1");

        buttonVBox.setStyle("-fx-background-color:black");
        buttonVBox.setPrefWidth(200);

        AnchorPane.setBottomAnchor(buttonVBox,0.0);
        AnchorPane.setTopAnchor(buttonVBox,0.0);

        getChildren().add(buttonVBox);
    }
}
