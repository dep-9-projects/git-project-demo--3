package controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class SplashScreenFormController {
    public Label lblLoading;
    public Rectangle pgbContainer;
    public Rectangle pgbLoader;
    public Label lblText;

    public void initialize(){
        Timeline timeline = new Timeline();

        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                lblLoading.setText("Loading UI....");
                pgbLoader.setWidth(pgbLoader.getWidth()+20);
                lblText.setTextFill(Color.rgb(231,127,137));

            }
        });
        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                lblLoading.setText("Active Plugins....");
                pgbLoader.setWidth(pgbLoader.getWidth()+100);
                lblText.setTextFill(Color.GREEN);

            }
        });
        KeyFrame keyFrame3 = new KeyFrame(Duration.millis(1500), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                lblLoading.setText("Initialize Application....");
                pgbLoader.setWidth(pgbContainer.getWidth());
                lblText.setTextFill(Color.BLUE);

            }
        });
        KeyFrame keyFrame4 = new KeyFrame(Duration.millis(1800), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                /*try {
                    Parent parent = FXMLLoader.load(this.getClass().getResource("/view/SplashScreenForm.fxml"));
                    Scene scene = new Scene(parent);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.show();
                    stage.centerOnScreen();
                    lblLoading.getScene().getWindow().hide();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }*/

            }
        });

        timeline.getKeyFrames().addAll(keyFrame1,keyFrame2,keyFrame3,keyFrame4);
        timeline.playFromStart();
    }
}
