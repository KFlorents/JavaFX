import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
   
    
    public static void main(String[] args) throws Exception 
    {
        launch(args);
        
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Label label0 = new Label("Welcome to JavaFX");
        Label label1 = new Label("Enter your Name");
        TextField textField = new TextField();
        Label label2 = new Label("Enter your Last Name");
        TextField textField1 = new TextField();
        HBox hBox = new HBox(label1,textField, label2,textField1);
        Button btn = new Button("Click me");
        VBox vBox = new VBox(label0, hBox, btn);
        hBox.setSpacing(15);
        vBox.setSpacing(15);
        VBox.setMargin(vBox, new Insets(20, 20, 20, 20));
        vBox.setPadding(new Insets(15));
        Scene scene = new Scene(vBox, 900, 400);

        primaryStage.setTitle("Hello, World!");
        primaryStage.setScene(scene);


        
        primaryStage.show();
    }
}
