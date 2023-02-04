package application;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {
private GameMenu gameMenu;
	@Override 
	public void start (Stage primaryStage) {
		try {
			Pane root = new Pane(); 
			root.setPrefSize(700,450);
			
			InputStream is = Files.newInputStream(Paths.get("res/images/chessdark.jpg"));
			Image img = new Image (is);
            is.close();
			
			ImageView imgView = new ImageView(img);
			imgView.setFitWidth(700);
			imgView.setFitHeight(450);
			
			gameMenu = new GameMenu();
			
			root.getChildren().addAll(imgView,gameMenu);
			
		Scene scene = new Scene(root);
		primaryStage.setResizable(false);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
}


public static void main(String[] args) {
	launch(args);
}
}


