

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Calctest1 extends Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Circle circle = new Circle();
        circle.setCenterX(300.0);
        circle.setCenterY(135.0);
        circle.setRadius(100.0);
        circle.setFill(Color.RED);

        Group root = new Group(circle);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Drawing a circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
