package application;
	
import java.io.IOException;



import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;

import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class GameMenu extends Parent{
		
		public GameMenu() {
			
			VBox menu0 = new VBox(10); 
			VBox menu1 = new VBox(10); 
			
			menu0.setTranslateX(50);
			menu0.setTranslateY(130);
			
		//	menu1.setTranslateX(50);
		//	menu1.setTranslateY(130);
			
			//final int offset = 400 ; 
			
			
			MenuButton btnPlay = new MenuButton(" PLAY"); 
			MenuButton btnOptions = new MenuButton(" RULES"); 
			MenuButton btnLeave = new MenuButton(" EXIT"); 
			
			
			
			btnPlay.setOnMouseClicked(event ->{
				try {
					Stage stage = (Stage) btnPlay.getScene().getWindow();
					// do what you have to do
					stage.close();
					Parent root = FXMLLoader.load(getClass().getResource("Vue.fxml"));
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
				
			});
			
			btnOptions.setOnMouseClicked(event ->{
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Rules of Chess");
				alert.setHeaderText(null);
				alert.setContentText("The rules of chess (also known as the laws of chess) are rules governing the play of the game of chess. While the exact origins of chess are unclear, modern rules first took form during the Middle Ages. The rules continued to be slightly modified until the early 19th century, when they reached essentially their current form. The rules also varied somewhat from place to place. Today, the standard rules are set by FIDE (Federation Internationale des echecs), the international governing body for chess. Slight modifications are made by some national organizations for their own purposes. There are variations of the rules for fast chess, correspondence chess, online chess, and Chess960.\n" + 
						"\n" + 
						"Chess is a two-player board game using a chessboard and sixteen pieces of six types for each player. Each type of piece moves in a distinct way. The object of the game is to checkmate (threaten with inescapable capture) the opponent's king. Games do not necessarily end in checkmate; players often resign if they believe they will lose. A game can also end in a draw in several ways.\n" + 
						"\n" );

				alert.showAndWait();
				
			});
			
			btnLeave.setOnMouseClicked(event ->{
				System.exit(0);
				
			});
			
			Label title = new Label("CHESS GAME"); 
			title.setFont(new Font("Arial", 45));
			title.setTextFill(Color.web("#FFFFFF"));
			
			menu0.getChildren().addAll(title,btnPlay,btnOptions,btnLeave);
			
			Rectangle bg = new Rectangle(800,600);
			bg.setFill(Color.GREY);
			bg.setOpacity(0.4);
			
			

			
			getChildren().addAll(bg,menu0);
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	