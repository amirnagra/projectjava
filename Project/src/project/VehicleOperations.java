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

/*Label numTag1 = new Label("1.");
        add(numTag1, 0, 0);

        Label numTag2 = new Label("2.");
        add(numTag2, 0, 1);

        Label numTag3 = new Label("3.");
        add(numTag3, 0, 2);

        Button carButton = new Button("Car");
        add(numTag1, 1, 0);

        Button truckButton = new Button("Truck");
        add(numTag1, 1, 1);

        Button bikeButton = new Button("Bike");
        add(numTag1, 1, 2);
        bikeButton.setPrefSize(40, 20);
        truckButton.setPrefSize(40, 20);
        carButton.setPrefSize(40, 20);*/
/**
 *
 * @author Rishabh
 */
public class VehicleOperations extends GridPane {

    Button addVehicle;
    Button removeVehicle;
    Button viewVehicle;
    Button back;
    Stage primaryStage;

    public VehicleOperations(Stage primaryStage) {
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

        addVehicle = new Button("ADD");
        add(addVehicle, 1, 0, 2, 1);
        addVehicle.setOnAction(event -> options(event));

        removeVehicle = new Button("REMOVE");
        add(removeVehicle, 1, 1, 2, 1);
        removeVehicle.setOnAction(event -> options(event));

        viewVehicle = new Button("VIEW");
        add(viewVehicle, 1, 2, 2, 1);
        viewVehicle.setOnAction(event -> options(event));

        back = new Button("GO BACK");
        add(back, 1, 3, 2, 1);
        back.setOnAction(event -> options(event));

        addVehicle.setPrefSize(300, 50);
        removeVehicle.setPrefSize(300, 50);
        viewVehicle.setPrefSize(300, 50);
        back.setMaxWidth(Double.MAX_VALUE);
    }

    private void options(ActionEvent event) {
        Button vehicleChosen = (Button) event.getSource();
        switch (vehicleChosen.getText()) {
            case "ADD":
                break;
            case "REMOVE":
                break;
            case "VIEW":
                break;
            case "GO BACK":
                VehicleChooser vehicleChooser = new VehicleChooser(primaryStage);
                ((BorderPane) getParent()).setCenter(vehicleChooser);
                primaryStage.sizeToScene();
                break;
        }
    }

    public Button getSourceCode(Button vehicleChosen) {
        return vehicleChosen;
    }
}
