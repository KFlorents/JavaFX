package application;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/*
 * Conversion Application 
 */
public class Converter extends Application {
	// fields
	private TextField kilometerField;
	private Label resultLabel;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		// create a labels
		Label myLabel = new Label("Enter the distance in Kilometer");
		resultLabel = new Label("");
		// create a button
		Button calcButton = new Button("Convert");
		
		// Create the event handler
		calcButton.setOnAction(new EventHandler<ActionEvent>()
		
		//class CalcButtonHandler implements EventHandler<ActionEvent>
		{
			@Override
			public void handle(ActionEvent event)
			{
				//Get the Kilometer 
				double kilometer = Double.parseDouble(kilometerField.getText());

				//Convert the kilometers to mile
				double miles = kilometer * 0.6214;

				//Display
				resultLabel.setText(String.format("%,.2f mile", miles));
			}
		});

		

		// Create a textField to enter the kilometer
		kilometerField = new TextField();
		// Create an HBOx
		HBox hBox = new HBox(10, myLabel, kilometerField);

		// Create an VBox
		VBox vbox = new VBox(10, hBox, calcButton, resultLabel);
		vbox.setAlignment(Pos.CENTER);
		// create a scene
		Scene scene = new Scene(vbox);

		// Put scene on stage
		primaryStage.setScene(scene);

		// Display
		primaryStage.show();
	}
	

}