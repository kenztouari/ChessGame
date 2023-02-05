package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import chessPieces.Queen;
import chessPieces.Horseman;
import chessPieces.Piece;
import chessPieces.Pawn; 
import chessPieces.Bishop;
import chessPieces.King;
import chessPieces.Rook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControleurFin {

	@FXML
    private Button backMenu;

    @FXML
    private Button btnExit;
    
    @FXML
    private Button btnRestart;
    
    
   
    
    @FXML
    void backToMenu(MouseEvent event) {
    	try{
    		Stage stage = (Stage) backMenu.getScene().getWindow();
		// do what you have to do
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("Vue.fxml"));
		Scene scene = new Scene(root);
		Stage newWindow = new Stage();
		newWindow.setTitle("Game");
		newWindow.setScene(scene);
		newWindow.show();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


    }

    @FXML
    void closeWindow(MouseEvent event) {
    	Stage stage = (Stage) btnExit.getScene().getWindow();
		// do what you have to do
		stage.close();
    }

    @FXML
    void restartGame(MouseEvent event) {
    	try {
			Stage stage = (Stage) btnRestart.getScene().getWindow();
			// do what you have to do
			stage.close();
			Parent root = FXMLLoader.load(getClass().getResource("Vue.fxml"));
			Scene scene = new Scene(root);
			Stage newWindow = new Stage();
			newWindow.setTitle("Game");
			newWindow.setScene(scene);
			newWindow.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
   
	
}
