/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package praktikum;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        HomeScene homeScene = new HomeScene(primaryStage);
        homeScene.homeScene();

    }

    public static void main(String[] args) {
        launch(args);
    }
}