package com.wttrhp.wttrpg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("create_page1.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("w_life_path.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
