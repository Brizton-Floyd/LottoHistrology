import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import presenter.HomePresenter;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lotto Histrology");

        primaryStage.setScene( createScene( loadMainPane() ));

        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     *Creates the main application scene
     */
    private Scene createScene(Pane mainPane){
        return new Scene(mainPane);
    }

    /**
     *Loads the main fxml layout sets up the screen navigator
     *Loads the firest lotto screen into the fxml layout
     *@return the loaded pane.
     *@throws IOException if the pane could not be loaded.
     */
    private Pane loadMainPane() throws IOException {

        HomePresenter homePresenter = new HomePresenter();
        return homePresenter.getView();
    }
    public static void main(String[] args){
        launch(args);
    }
}
