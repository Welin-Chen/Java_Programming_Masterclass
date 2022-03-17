import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(App.class.getResource("sample.fxml"));
        // FXMLLoader root = FXMLLoader.load(App.class.getResource("sample.fxml"));

        // GridPane root = new GridPane();
        // root.setAlignment(Pos.CENTER);
        // root.setVgap(10);
        // root.setHgap(10);

        // Label greeting = new Label("Welcome to JavaFX!");
        // greeting.setTextFill(Color.GREEN);
        // greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));

        // root.getChildren().add(greeting);

        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
        // primaryStage.setTitle("Hello World!");
        // Button btn = new Button();
        // btn.setText("Say 'Hello World'");
        // btn.setOnAction(new EventHandler<ActionEvent>() {

        // @Override
        // public void handle(ActionEvent event) {
        // System.out.println("Hello World!");
        // }
        // });

        // StackPane root = new StackPane();
        // root.getChildren().add(btn);
        // primaryStage.setScene(new Scene(root, 300, 250));
        // primaryStage.show();
    }
}