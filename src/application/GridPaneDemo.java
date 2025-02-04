package application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.stage.Stage;


public class GridPaneDemo extends Application 
{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
			// Create some label controls.
		Label label1 = new Label("This is label1");
		Label label2 = new Label("This is label2");
		Label label3 = new Label("This is label3");
		Label label4 = new Label("This is label4");
		
//		create a gridPane
		GridPane gridPane = new GridPane(); 
		
//		Add the labels to gridPane
		gridPane.add(label1,0,0);
		gridPane.add(label2,1,0);
		gridPane.add(label3,0,1);
		gridPane.add(label4,1,1);
		
		gridPane.setGridLinesVisible(true);
//		Create the scene with the gridPane as its root node.
//		the scene is 200 pixels wide by 100 pixels high
		
		Scene scene = new Scene(gridPane, 200,100);
		
//		Add the scene to the Stage
		primaryStage.setScene(scene);
		
//		Show the scene
		primaryStage.show();
		



	}

}
