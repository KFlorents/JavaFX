package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

public class ImgeDemo extends Application {
	public static void main(String[] args) {
		// Launch the application
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		
		//Create an image object
		Image image = new Image("file:th.jpg");
		Image image0 = new Image("file:togo-.jpg");
		Image image1 = new Image("file:s.jpg");
		
		
		//Create an ImageView object
		ImageView imageView = new ImageView(image);
		ImageView imageView0 = new ImageView(image0);
		ImageView imageView1 = new ImageView(image1);
		
		// setting the image size
		imageView.setFitWidth(200);
		//imageView.setFitHeight(200);
		imageView.setPreserveRatio(true);
		
		imageView0.setFitWidth(200);
		imageView0.setPreserveRatio(true);
		
		imageView1.setFitWidth(200);
		imageView1.setPreserveRatio(true);
		
		
		//put the label in the box, 3 images and 10 pixel spacing
		HBox hBox = new HBox(10,imageView,imageView0,imageView1);
		
		//Put  30 pixels padding around the HBox
		hBox.setPadding(new Insets(30));
		
		//create a scene with the HBox as its root node
		Scene scene = new Scene(hBox);
		
		hBox.setAlignment(Pos.CENTER);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Mon Togo");
		primaryStage.show();

			
		
	}
}
