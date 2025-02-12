
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class App extends Application{
   Label labelabel;
   Label label1;
   Label label2;
   Label label3;
   Label label4;
   Label label5;
   Label label6;
   Label label7;
   TextField textField1;
   TextField textField2;
   TextField textField3;
   TextField textField4;
   
    public static void main(String[] args) throws Exception 
    {
        launch(args);  
    }
    @SuppressWarnings("unused")
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Label label0 = new Label("Legumes Business");
        label1 = new Label("Enter your First Name");
        textField1 = new TextField();
        label2 = new Label("Enter your Last Name");
        label3 = new Label("Chose your legume");
        label4 = new Label("Enter the amounts of kilograms");
        textField3 = new TextField();
        textField2 = new TextField();
        textField4 = new TextField();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
      
        HBox hBox = new HBox(label1,textField1, label2,textField2);
        HBox hBox0 = new HBox(label3,textField3, label4,textField4);
        Button btn = new Button("Register");
        HBox hBox1 = new HBox(btn);
        VBox vBox = new VBox(label0, hBox,hBox0, hBox1, label5, label6, label7);

        hBox1.setAlignment(Pos.CENTER);
        hBox.setSpacing(15);
        hBox0.setSpacing(15);
        vBox.setSpacing(15);
        hBox1.setSpacing(15);
        label5.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        
    /*
    * Event Handler class for registering the user.
    */
        //btn.setOnAction(new EventHandler<ActionEvent>(){
        btn.setOnAction(event -> {
          //  @Override
            //public void handle(ActionEvent event) 
          //  {
                String firstName = textField1.getText();
                String lastName = textField2.getText();
                String legume = textField3.getText();
                String amount = textField4.getText();
                label5.setText("Hello " + firstName + " " + lastName + " you chose " + legume + " and you want " + amount + " kilograms");
                label6.setText("Thank you for your registration, we will contact you soon");   
           // }
        }); 

        VBox.setMargin(vBox, new Insets(20, 20, 20, 20));
        vBox.setPadding(new Insets(15));
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox);

        primaryStage.setTitle("Application");
        primaryStage.setScene(scene);

        primaryStage.show();
        
    }
       
}
