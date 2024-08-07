package com.jayash.javafxproject.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;

public class hbox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Button
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // HBox
        HBox root = new HBox(10);
        root.setPadding(new Insets(5));
        root.setAlignment(Pos.BASELINE_RIGHT);
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);

        // Scene
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
