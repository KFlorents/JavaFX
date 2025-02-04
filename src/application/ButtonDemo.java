package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// Create a label
		//Label label1 = new Label("Click for the magic");
		Button myButton = new Button("Click for the magic");
		
		// create an image object
		Image ghImage = new Image("file:ghanaflag.jpg");
		Image finImage = new Image("file:togo-.jpg");

		// create the imageView components
		ImageView ghImageView = new ImageView(ghImage);
		ImageView finImageView = new ImageView(finImage);

		// Resizing the image width
		ghImageView.setFitWidth(300);
		ghImageView.setPreserveRatio(true);

		finImageView.setFitWidth(300);
		finImageView.setPreserveRatio(true);

		// Create a griPane and hBox object
		GridPane gridPane = new GridPane();
		HBox hBox = new HBox(10, myButton, gridPane);

		// set the hBox position
		hBox.setAlignment(Pos.CENTER_LEFT);

		// Add the imageView to the GridPane
		
		gridPane.add(finImageView, 1, 1);
		gridPane.add(ghImageView, 1, 0);

		// gridPane.add(hBox,0,0);
		gridPane.setPadding(new Insets(10));
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		
		myButton.setPadding(new Insets(10));
		hBox.setAlignment(Pos.CENTER);

		// Create a scene
		Scene scene = new Scene(hBox);

		// adding the scene to the stage
		primaryStage.setScene(scene);

		// Set a title
		primaryStage.setTitle("Images");

		// Show the window
		primaryStage.show();

	}
}
