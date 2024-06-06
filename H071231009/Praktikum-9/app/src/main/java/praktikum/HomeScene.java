package praktikum;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;
    private Scene scene;
    private VBox layout;

    public HomeScene(Stage stage) {
        this.stage = stage;
        this.layout = new VBox(20);
        this.layout.setAlignment(Pos.CENTER);
    }

    public void homeScene() {

        Image backgroundImage = new Image(getClass().getResource("/abc.jpg").toExternalForm());
        ImageView imageView = new ImageView(backgroundImage);
        imageView.setPreserveRatio(false);
        imageView.setFitWidth(800);
        imageView.setFitHeight(600);
        
        Text title = new Text("Makanan Khas Makassar");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        VBox makananBox = new VBox(20);
        makananBox.setAlignment(Pos.CENTER);

        HBox cotoMakassarBox = new HBox(10);
        cotoMakassarBox.setAlignment(Pos.CENTER_LEFT);
        ImageView cotoMakassarImage = new ImageView(new Image(getClass().getResource("/coto.png").toExternalForm()));
        cotoMakassarImage.setFitHeight(100);
        cotoMakassarImage.setFitWidth(100);
        VBox cotoMakassarTextBox = new VBox(5);
        Text cotoMakassarTitle = new Text("Coto Makassar");
        cotoMakassarTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Text cotoMakassarDesc = new Text("Coto Makassar adalah sup daging sapi khas Makassar yang dimasak dengan bumbu rempah seperti ketumbar dan jintan. \nDisajikan dengan ketupat atau burasa.");
        cotoMakassarTextBox.getChildren().addAll(cotoMakassarTitle, cotoMakassarDesc);
        cotoMakassarBox.getChildren().addAll(cotoMakassarImage, cotoMakassarTextBox);

        HBox pisangIjoBox = new HBox(10);
        pisangIjoBox.setAlignment(Pos.CENTER_LEFT);
        ImageView pisangIjoImage = new ImageView(new Image(getClass().getResource("/pisangijo.png").toExternalForm()));
        pisangIjoImage.setFitHeight(100);
        pisangIjoImage.setFitWidth(100);
        VBox pisangIjoTextBox = new VBox(5);
        Text pisangIjoTitle = new Text("Pisang Ijo");
        pisangIjoTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Text pisangIjoDesc = new Text("Pisang Ijo adalah makanan penutup dari pisang yang dibungkus adonan tepung hijau, \ndisajikan dengan saus santan manis dan es serut.");
        pisangIjoTextBox.getChildren().addAll(pisangIjoTitle, pisangIjoDesc);
        pisangIjoBox.getChildren().addAll(pisangIjoImage, pisangIjoTextBox);

        HBox ondeOndeBox = new HBox(10);
        ondeOndeBox.setAlignment(Pos.CENTER_LEFT);
        ImageView ondeOndeImage = new ImageView(new Image(getClass().getResource("/onde.png").toExternalForm()));
        ondeOndeImage.setFitHeight(100);
        ondeOndeImage.setFitWidth(100);
        VBox ondeOndeTextBox = new VBox(5);
        Text ondeOndeTitle = new Text("Onde-Onde");
        ondeOndeTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        Text ondeOndeDesc = new Text("Onde-Onde adalah jajanan tradisional berupa bola-bola ketan isi pasta kacang hijau, \nditaburi biji wijen dan digoreng hingga renyah.");
        ondeOndeTextBox.getChildren().addAll(ondeOndeTitle, ondeOndeDesc);
        ondeOndeBox.getChildren().addAll(ondeOndeImage, ondeOndeTextBox);

        makananBox.getChildren().addAll(cotoMakassarBox, pisangIjoBox, ondeOndeBox);

        Button profil = new Button("Profile");
        profil.setOnAction(e -> {
            ProfileScene profileScene = new ProfileScene(stage);
            profileScene.profileScene();
        });
        
        layout.getChildren().addAll(profil, title, makananBox);
        layout.setPadding(new Insets(20));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, layout);

        scene = new Scene(stackPane, 800, 600); 
        stage.setTitle("HomeScene");
        stage.setScene(scene);
        stage.show();
    }
}
