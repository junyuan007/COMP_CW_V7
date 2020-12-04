package random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Try_transition extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle1 = new Rectangle(300, 250);
        rectangle1.setFill(Color.RED);

        Button nextView = new Button("Next");
        nextView.setPadding(new Insets(10));
        BorderPane view1 = new BorderPane(rectangle1, null, null, nextView, null);
        BorderPane.setAlignment(nextView, Pos.CENTER);

        Group view2 = new Group();
        Rectangle rectangle2 = new Rectangle(300, 250);
        rectangle2.setFill(Color.BLUE);
        view2.getChildren().add(rectangle2);

        StackPane root = new StackPane(view1);

        nextView.setOnAction(event -> {
            root.getChildren().add(view2);
            double width = root.getWidth();
            KeyFrame start = new KeyFrame(Duration.ZERO,
                    new KeyValue(view2.translateXProperty(), width),
                    new KeyValue(view1.translateXProperty(), 0));
            KeyFrame end = new KeyFrame(Duration.seconds(1),
                    new KeyValue(view2.translateXProperty(), 0),
                    new KeyValue(view1.translateXProperty(), -width));
            Timeline slide = new Timeline(start, end);
            slide.setOnFinished(e -> root.getChildren().remove(view1));
            slide.play();
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}