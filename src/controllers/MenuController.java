package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Main;


public class MenuController implements Initializable {

    @FXML private Button displaySmall;
    @FXML private Button displayLarge;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML private void switchToSmall(ActionEvent event) {
        try {
            URL smallUrl = getClass()
                    .getResource("/resources/view/small/Main.fxml");
            AnchorPane smallScreen = FXMLLoader.load(smallUrl);
            
            BorderPane border = Main.getRoot();
            border.setCenter(smallScreen);
            
            Main.getStage().setWidth(320+16);
            Main.getStage().setHeight(480+74);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }

    @FXML private void switchToLarge(ActionEvent event) {
        try {
            URL largeUrl = getClass()
                    .getResource("/resources/view/large/Main.fxml");
            AnchorPane largeScreen = FXMLLoader.load(largeUrl);
            
            BorderPane border = Main.getRoot();
            border.setCenter(largeScreen);
            
            Main.getStage().setWidth(1024+15);
            Main.getStage().setHeight(768+75);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
