import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
   Label myLabel;
    
    public static void main(String[] args) throws Exception 
    {
        launch(args);  
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Label label0 = new Label("Welcome to JavaFX");
        Label label1 = new Label("Enter your Name");
        TextField textField1 = new TextField();
        Label label2 = new Label("Enter your Last Name");
        Label label3 = new Label("Chose your legume");
        Label label4 = new Label("How many kilos");
        TextField textField3 = new TextField();
        TextField textField2 = new TextField();
        TextField textField4 = new TextField();
        HBox hBox = new HBox(label1,textField1, label2,textField2);
        HBox hBox0 = new HBox(label3,textField3, label4,textField4);
        Button btn = new Button("Click me");
        HBox hBox1 = new HBox(btn);
        VBox vBox = new VBox(label0, hBox,hBox0, hBox1);

        hBox1.setAlignment(Pos.CENTER);
        hBox.setSpacing(15);
        hBox0.setSpacing(10);
        vBox.setSpacing(15);
        
        VBox.setMargin(vBox, new Insets(20, 20, 20, 20));
        vBox.setPadding(new Insets(15));
        Scene scene = new Scene(vBox, 800, 400);

        primaryStage.setTitle("Application");
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
