package com.witnip.guessnumber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GuessNumberApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuessNumberApplication.class.getResource("GuessNumber.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Guess the number");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}