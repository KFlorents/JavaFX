package application;

import javafx.scene.control.Label;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleButton extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{	
		// Create a label 
		Label label =new Label("CLick on the button to see  the message");
		//Create a button object
		Button buttonDemo = new Button("Click Moi");

		//create VBox for the button
		VBox vbox = new VBox(10, label,buttonDemo );
		//Create a scene
		Scene scene = new Scene(vbox, 200, 100);
		
		vbox.setPadding(new Insets(10));
		vbox.setAlignment(Pos.CENTER);
		
		//Set the stage Title
		primaryStage.setTitle("Simply");
		
		//Put the scene on the stage 
		primaryStage.setScene(scene);
		
		//Show the Stage
		primaryStage.show();
		
	}
}
