
/**
 * Project Name: Quiz Game
 * COP 3330C Object Oriented Programming
 * written by: @author Nenad Jovanovic (njovanovic1@mail.valenciacollege.edu)
 * created: 12/5/22
 */

                                                 /** Main Class */
package com.example.final_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 816, 688);
        stage.setTitle("Trivia Game");
        stage.setScene(scene);
        stage.show();
    }

  /**
    public static void main(String[] args) {
        launch();
    }*/
}