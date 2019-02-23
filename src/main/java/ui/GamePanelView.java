package ui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import presenter.GamePanelPresenter;

import java.util.Set;

public class GamePanelView extends BaseView<GamePanelPresenter> {

    public GamePanelView(){
        setPrefWidth(500.0);
        setPrefHeight(500.0);
        setStyle("-fx-background-color:beige");
    }

    @Override
    public void setUpUi() {
        buildMenuBar();
    }

    private void buildMenuBar() {

        MenuBar menuBar = new MenuBar();
        AnchorPane.setTopAnchor(menuBar, 0.0 );
        AnchorPane.setLeftAnchor(menuBar, 0.0 );
        AnchorPane.setRightAnchor(menuBar, 0.0 );

        final Set<String> gameNames = getPresenter().getGameNames();
        Menu gameNameMenu = new Menu("Lottery Games");
        Menu pick3Menu = new Menu("Pick 3");
        Menu pick4Menu = new Menu("Pick 4");

        for(String name : gameNames){
            if(name.contains("Pick 3")){
                MenuItem menuItem = new MenuItem( name );
                addActionToMenuitems( menuItem );
                pick3Menu.getItems().add( menuItem );
            }
            else if( name.contains("Pick 4")){
                MenuItem menuItem = new MenuItem( name );
                addActionToMenuitems( menuItem );
                pick4Menu.getItems().add( menuItem );
            }
            else {
                MenuItem gameItem = new MenuItem(name);
                addActionToMenuitems( gameItem );
                gameNameMenu.getItems().add( gameItem );
            }
        }

        gameNameMenu.getItems().add( pick3Menu );
        gameNameMenu.getItems().add(pick4Menu );
        menuBar.getMenus().add( gameNameMenu );

        getChildren().add( menuBar );
    }

    private < T extends MenuItem> void addActionToMenuitems( T menuItem ){

        menuItem.setOnAction( e -> getPresenter().onModelChanged( menuItem.getText() ));
    }
}
