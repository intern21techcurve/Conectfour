package com.first.connectfour;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

//    private ModuleLayer.Controller controller;
    private Controller2 controller;

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        GridPane rootGridPane = loader.load();

        controller = loader.getController();

        Scene scene = new Scene(rootGridPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Connect Four");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}