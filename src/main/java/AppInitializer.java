import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = this.getClass().getResource("/view/MainForm.fxml");
        AnchorPane homeFormContainer = FXMLLoader.load(resource);
        Scene homeFormScene = new Scene(homeFormContainer);
        primaryStage.setScene(homeFormScene);
        primaryStage.centerOnScreen();
        primaryStage.setTitle("Home");
        primaryStage.show();

    }
}
