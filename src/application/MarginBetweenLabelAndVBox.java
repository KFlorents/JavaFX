package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
//import javafx.scene.layout.Insets;
import javafx.stage.Stage;

public class MarginBetweenLabelAndVBox extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");
        
        VBox vbox = new VBox(label);
        // Setting a margin of 20 pixels on all sides of the label
        VBox.setMargin(label, new javafx.geometry.Insets(20, 20, 20, 20));
        
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("JavaFX Margin Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

