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
public class VehicleChooser extends GridPane {

    Button carButton;
    Button truckButton;
    Button bikeButton;
    Button back;
    TextField password;
    boolean passwordValidated = false;
    Stage primaryStage;

    public VehicleChooser(Stage primaryStage) {
        this.primaryStage = primaryStage;
        setVgap(10);
        setHgap(4);
        setAlignment(Pos.CENTER);
        setPadding(new Insets(10));
        Label tag1 = new Label("1.");
        add(tag1, 0, 0);

        Label tag2 = new Label("2.");
        add(tag2, 0, 1);

        Label tag3 = new Label("3.");
        add(tag3, 0, 2);

        carButton = new Button("CAR");
        add(carButton, 1, 0, 2, 1);
        carButton.setOnAction(event -> options(event));

        truckButton = new Button("TRUCK");
        add(truckButton, 1, 1, 2, 1);
        truckButton.setOnAction(event -> options(event));

        bikeButton = new Button("BIKE");
        add(bikeButton, 1, 2, 2, 1);
        bikeButton.setOnAction(event -> options(event));

        back = new Button("Logout");
        add(back, 1, 3, 2, 1);
        back.setOnAction(event -> options(event));

        bikeButton.setPrefSize(300, 50);
        truckButton.setPrefSize(300, 50);
        carButton.setPrefSize(300, 50);
        back.setMaxWidth(Double.MAX_VALUE);
    }

    private void options(ActionEvent event) {
        Button vehicleChosen = (Button) event.getSource();
        switch (vehicleChosen.getText()) {
            case "CAR":
                vehicleSpecifications(vehicleChosen);
                break;
            case "TRUCK":
                vehicleSpecifications(vehicleChosen);
                break;
            case "BIKE":
                vehicleSpecifications(vehicleChosen);
                break;
            case "Logout":
                LoginPage loginPage = new LoginPage(primaryStage);
                ((BorderPane) getParent()).setCenter(loginPage);
                primaryStage.sizeToScene();
                break;
        }

    }

    private void vehicleSpecifications(Button vehicleChosen) {
        VehicleOperations vehicleOperations = new VehicleOperations(primaryStage);
        ((BorderPane) getParent()).setCenter(vehicleOperations);
        primaryStage.sizeToScene();
        vehicleOperations.getSourceCode(vehicleChosen);
    }
}
