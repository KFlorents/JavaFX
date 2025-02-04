package application;
	


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

/*
 * A javafFX Hello world application
 */
public class MyFirstGUI extends Application {

	public static void main(String[] args) {
		// Launch the application
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//Create  label control
		Label messageLabel = new Label("Hello word!");
		
		//put the label in the box
		HBox hBox = new HBox(messageLabel);
		//GridPane gridPane = new GridPane();
		
//		create a scene with the HBox as its root node
		Scene scene = new Scene(hBox, 300, 100);
		hBox.setAlignment(Pos.CENTER);
//		Add the Scene to the Stage
		primaryStage.setScene(scene);
		
		   
		primaryStage.setTitle("MyFirstGUI");
		primaryStage.show();

			
		
	}
	
}
