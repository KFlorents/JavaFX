package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		{

			// Create an image object
			Image image = new Image("file:th.jpg");
			Image image0 = new Image("file:togo-.jpg");
			Image image1 = new Image("file:s.jpg");
			Image image2 = new Image("file:Afrique-T.GIF");

			// Create an ImageView object
			ImageView imageView = new ImageView(image);
			ImageView imageView0 = new ImageView(image0);
			ImageView imageView1 = new ImageView(image1);
			ImageView imageView2 = new ImageView(image2);

			// setting the image size
			imageView.setFitWidth(200);
			// imageView.setFitHeight(200);
			imageView.setPreserveRatio(true);

			imageView0.setFitWidth(200);
			imageView0.setPreserveRatio(true);

			imageView1.setFitWidth(200);		
			imageView1.setPreserveRatio(true);
			
			imageView2.setFitWidth(200);
			imageView2.setFitHeight(200);
			imageView2.setPreserveRatio(true);
//			Create GridPane object
			GridPane gridPane =new GridPane();
			gridPane.add(imageView,0,0);
			gridPane.add(imageView0,1,0);
			gridPane.add(imageView1,0,1);
			gridPane.add(imageView2,1,1);

		
//  set the gap size
			gridPane.setVgap(10);
			gridPane.setHgap(10);
			// Put 30 pixels padding around the HBox
		gridPane.setPadding(new Insets(30));

			// create a scene with the HBox as its root node
			Scene scene = new Scene(gridPane);

			//vBox.setAlignment(Pos.CENTER);

			primaryStage.setScene(scene);

			primaryStage.setTitle("Mon Togo");
			primaryStage.show();

		}
	}
}
