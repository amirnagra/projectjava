package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Rishabh
 */
public class LoginPage extends GridPane {

    TextField login;
    TextField password;
    boolean passwordValidated = false;
    Stage primaryStage;

    public LoginPage(Stage primaryStage) {
        this.primaryStage = primaryStage;
        setVgap(10);
        setHgap(10);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        Label loginLabel = new Label("Login:");
        add(loginLabel, 0, 0);

        Label passwordLabel = new Label("Password:");
        add(passwordLabel, 0, 1);

        login = new TextField();
        add(login, 1, 0, 2, 1);

        password = new TextField();
        add(password, 1, 1, 2, 1);

        Button submitButton = new Button("Submit");
        add(submitButton, 1, 2);
        submitButton.setOnAction(event -> validate());

        Button clear = new Button("Clear");
        add(clear, 2, 2);
        clear.setOnAction(event -> clear());
    }

    private void clear() {
        login.clear();
        password.clear();
    }

    //validate username password
    private void validate() {
        if (login.getText().isEmpty() || password.getText().isEmpty()) {
            //display alert message if empty
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText("Please fix the error");
            alert.setContentText("Both field are required!");

            alert.showAndWait();

            System.out.println("It's Empty");
            passwordValidated = false;
        } else //read password from the file and compare for login information
        {
            passwordValidated = true;
            VehicleChooser chooser = new VehicleChooser(primaryStage);
            ((BorderPane) getParent()).setCenter(chooser);
            primaryStage.sizeToScene();
        }
    }
}
