//Assignment 12
//Name: 蔡皓宇
//ID: 110502201
//Course: 2023-CE1002-B
package com.example.a12_110502201;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class A12_110502201 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(A12_110502201.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.show();
        // 將controller load到主函式裡
        A12_110502201_Controller controller = fxmlLoader.getController();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
