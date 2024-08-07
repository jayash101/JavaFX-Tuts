package com.jayash.javafxproject.layouts;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.geometry.*;

public class flowpane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Button
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");

        // Flow Pane
        FlowPane root = new FlowPane(Orientation.HORIZONTAL, 5, 5);
        root.setPadding(new Insets(5));
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);

        // Scene
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX FlowPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
