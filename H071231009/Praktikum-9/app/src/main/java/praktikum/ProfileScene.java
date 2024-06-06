package praktikum;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProfileScene {
    Stage stage;

    public ProfileScene(Stage stage) {
        this.stage = stage;
    }

    public void profileScene() {
        // Load background image
        Image backgroundImage = new Image(getClass().getResource("/abc.jpg").toExternalForm());
        ImageView imageView = new ImageView(backgroundImage);
        imageView.setPreserveRatio(false);
        imageView.setFitWidth(800); // Set to match scene width
        imageView.setFitHeight(600); // Set to match scene height

        // Create labels
        Label labelNama = new Label("Nama: Resky Auliyah Kartini Askin");
        Label labelNim = new Label("Nim : H071231009");
        Label labelUmur = new Label("Umur: 19");
        Label labelProdi = new Label("Prodi: Sistem Informasi");

        // Create button
        Button kembali = new Button("Kembali");
        kembali.setOnAction(e -> {
            HomeScene homeScene = new HomeScene(stage);
            homeScene.homeScene();
        });

        // Create VBox for labels and button
        VBox vBox = new VBox(20, labelNama, labelNim, labelUmur, labelProdi, kembali);
        vBox.setAlignment(Pos.CENTER);

        // Create StackPane to overlay VBox on top of the ImageView
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, vBox);

        // Create scene
        Scene scene = new Scene(stackPane, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Profile");
        stage.show();
    }
}
