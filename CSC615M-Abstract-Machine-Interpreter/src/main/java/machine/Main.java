package machine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Abstract Machine Interpreter");

        window.setOnCloseRequest(e -> {e.consume(); closeProgram();});

        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));

        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public void closeProgram() {
        window.close();
    }
}