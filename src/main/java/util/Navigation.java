package util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Navigation {

    public static void navigate(Routes routes) throws IOException {
        Stage stage = new Stage();
        URL resource =null;
        switch (routes){
            case PAGE1:
                resource = Navigation.class.getResource("/view/Page1Form.fxml");
                stage.setTitle("PAGE 1");
                break;

            case PAGE2:
                resource = Navigation.class.getResource("/view/Page2Form.fxml");
                stage.setTitle("PAGE 2");
                break;

            case PAGE3:
                resource = Navigation.class.getResource("/view/Page3Form.fxml");
                stage.setTitle("PAGE 3");
                break;
            case PAGE4:
                resource = Navigation.class.getResource("/view/Page4Form.fxml");
                stage.setTitle("PAGE 4");
                break;
        }
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        AnchorPane container =fxmlLoader.load();
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
