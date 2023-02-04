package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {
	  private final int BOARD_SIZE = 8;
	  private final int TILE_SIZE = 50;
	  private ImageView[][] pieces = new ImageView[BOARD_SIZE][BOARD_SIZE];

	  @Override
	  public void start(Stage primaryStage) {
		  try {
	    GridPane board = new GridPane();
	  
	    for (int row = 0; row < BOARD_SIZE; row++) {
	      for (int col = 0; col < BOARD_SIZE; col++) {
	    	  Rectangle rectangle = new Rectangle(TILE_SIZE*2,TILE_SIZE*2);
	    	  rectangle.setFill((row + col) % 2 == 0 ? Color.WHITE : Color.BROWN);
	          board.add(rectangle, col, row);
	    	  
	      }
	    }
	    
	   
	    Image whiteKnightImage = new Image ("file:cavalier_blanc.png");
	    Image blackKnightImage = new Image ("file:cavalier_noir.png");
	   Image blackRookImage = new Image ("file:tour_noir.png");
	    Image whiteRookImage = new Image ("file:tour_blanc.png");
	    Image blackBishopImage = new Image("file:fou_noir.png");
	    Image whiteBishopImage = new Image("file:fou_blanc.png");
	    Image blackQueenImage = new Image("file:reine_noir.png");
	    Image whiteQueenImage = new Image("file:reine_blanc.png");
	    Image blackKingImage = new Image("file:roi_noir.png");
	    Image whiteKingImage = new Image("file:roi_blanc.png");
	    Image blackPawnImage = new Image("file:pion_noir.png");
	    Image whitePawnImage = new Image("file:pion_blanc.png");
	 
	   
	   pieces[0][0] = new ImageView(blackRookImage);
	    pieces[0][1] = new ImageView(blackKnightImage);
	    pieces[0][2] = new ImageView(blackBishopImage);
	    pieces[0][3] = new ImageView(blackQueenImage);
	    pieces[0][4] = new ImageView(blackKingImage);
	    pieces[0][5] = new ImageView(blackBishopImage);
	    pieces[0][6] = new ImageView(blackKnightImage);
	    pieces[0][7] = new ImageView(blackRookImage);
	    for (int col = 0; col < 8; col++) {
	        pieces[1][col] = new ImageView(blackPawnImage);
	        GridPane.setHalignment(pieces[1][col], HPos.CENTER);
 		    GridPane.setValignment(pieces[1][col], VPos.CENTER);
 		   board.add(pieces[1][col], col, 1);
	        
	     }
	    pieces[7][0] = new ImageView(whiteRookImage);  
	    pieces[7][1] = new ImageView(whiteKnightImage);
	    pieces[7][2] = new ImageView(whiteBishopImage);
	    pieces[7][3] = new ImageView(whiteQueenImage);
	    pieces[7][4] = new ImageView(whiteKingImage);
	    pieces[7][5] = new ImageView(whiteBishopImage);
	    pieces[7][6] = new ImageView(whiteKnightImage);
	    pieces[7][7] = new ImageView(whiteRookImage);
	    for (int col = 0; col < 8; col++) {
	       pieces[6][col] = new ImageView(whitePawnImage);
	       GridPane.setHalignment(pieces[6][col], HPos.CENTER);
		    GridPane.setValignment(pieces[6][col], VPos.CENTER);
		   board.add(pieces[6][col], col, 6);
	    }

	    for (int row = 0; row < 8; row++) {
	       for (int col = 0; col < 8; col++) {
	    	   if(row==0 || row==7) {
	    		   GridPane.setHalignment(pieces[row][col], HPos.CENTER);
	    		   GridPane.setValignment(pieces[row][col], VPos.CENTER);
	    		   board.add(pieces[row][col], col, row);
	    	   }
	    		 
	    	   }
	         
	       }
	    
	   
	    
	    board.setPadding(new Insets(50));
	    board.setGridLinesVisible(true);
	    Scene scene = new Scene(board, 500, 500);
	    primaryStage.setTitle("Chess Game");
	    primaryStage.setScene(scene);
	   
	    primaryStage.show();
	  }
		  catch(Exception e) {
				e.printStackTrace();
			}
		}
	
  public static void main(String[] args) {
    launch(args);
  }
}
