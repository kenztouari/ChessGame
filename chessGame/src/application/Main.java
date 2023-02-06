package application;
	

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;




public class Main extends Application {
	
	private GameMenu gameMenu;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			Pane root = new Pane();
			root.setPrefSize(700,450);
			
			
			// ouvrir la deuxieme page fxml 
			
			
			
			
			/*InputStream is = Files.newInputStream(Paths.get("res/images/image1.jpg"));
			
			Image img = new Image(is);
			
			is.close();
			
			ImageView imgView = new ImageView(img);
			imgView.setFitWidth(700);
			imgView.setFitHeight(450);
			
			gameMenu = new GameMenu();
			
			
		
			
			
			root.getChildren().addAll(imgView,gameMenu);*/
			
			 root = FXMLLoader.load(getClass().getResource("Vue.fxml"));
				Scene scene = new Scene(root);
				Stage newWindow = new Stage();
				newWindow.setTitle("Game");
				newWindow.setScene(scene);
				newWindow.setResizable(false);
				newWindow.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			/*Scene scene = new Scene(root);
			primaryStage.setResizable(false);
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
