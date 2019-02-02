import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import presenter.HomePresenter;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        this.primaryStage = primaryStage;

        this.primaryStage.setTitle("Lotto Histrology");

        this.primaryStage.setScene( createScene( loadMainPane() ));

        this.primaryStage.setResizable(false);
        this.primaryStage.show();
    }

    /**
     *Creates the main application scene
     */
    private Scene createScene(Pane mainPane){
        return new Scene(mainPane);
    }

    private Pane loadMainPane() {

        HomePresenter homePresenter = new HomePresenter(primaryStage);
        return homePresenter.getView();
    }
    public static void main(String[] args){
        launch(args);
    }
}
