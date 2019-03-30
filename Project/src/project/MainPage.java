/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Rishabh
 */
public class MainPage extends Application {

    GridPane pane;
    BorderPane root;
    Scene scene1;
    Scene scene2;
    Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();
        this.primaryStage = primaryStage;
        Label title = new Label("App Name");
//        VBox.setMargin(title, new Insets(15, 20, 10, 20));
        root.setTop(title);

        LoginPage login = new LoginPage(this.primaryStage);

//        BorderPane.setAlignment(login, Pos.CENTER);
//        BorderPane.setAlignment(title, Pos.CENTER);
        BorderPane.setAlignment(title, Pos.CENTER);
        root.setCenter(login);
        scene1 = new Scene(root);
        primaryStage.sizeToScene();

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
