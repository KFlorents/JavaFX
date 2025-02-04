package application;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Button_Event_Handler extends Application{
		private Label myLabel;
		public static void main(String[] args) {
			launch(args);
		}
		
		@Override
		public void start(Stage primaryStage)
		{	
			// Create a label 
			myLabel =new Label("Click on the button to see  the message");
			//Create a button object
			Button buttonDemo = new Button("Click Moi");
			//Create a text field
			TextField myTextField = new TextField();
			
			//Register the action
		    buttonDemo.setOnAction(new ButtonClickHandler());

			//create VBox for the button
			VBox vbox = new VBox(10, myLabel,buttonDemo, myTextField );
			//Create a scene
			Scene scene = new Scene(vbox, 400, 200);
			
			vbox.setPadding(new Insets(10));
			vbox.setAlignment(Pos.CENTER);
			
			//Set the stage Title
			primaryStage.setTitle("Simply");
			
			//Put the scene on the stage 
			primaryStage.setScene(scene);
			
			//Show the Stage
			primaryStage.show();
			
		
	}
		class ButtonClickHandler implements EventHandler<ActionEvent>
		{
			@Override
			public void handle (ActionEvent event)
			{
				myLabel.setText("Thanks for clicking the button!");
			}
		}

}
