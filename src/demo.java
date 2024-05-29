//package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class demo extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
//        Group root = new Group();
        Scene scene = new Scene(root);

//        Image icon = new Image("first.png");
//        stage.getIcons().add(icon);
//        stage.setTitle("Stage Demo Program w00t w00t");
        //stage.setWidth(420);
        //stage.setHeight(420);
        //stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}