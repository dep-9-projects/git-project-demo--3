package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import util.Navigation;
import util.Routes;

import java.io.IOException;

public class MainFormController {


    public JFXButton btnPage1;
    public JFXButton btnPage2;
    public JFXButton btnPage3;
    public JFXButton btnPane4;

    public void btnPage1SetOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PAGE1);
    }

    public void btnPage2SetOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PAGE2);
    }

    public void btnPage3SetOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PAGE3);
    }

    public void btnPage4SetOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PAGE4);
    }
}
