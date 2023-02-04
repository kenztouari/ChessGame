package chessPieces;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Diagonal;
import movements.Linear;

public class Pawn extends Piece implements Diagonal, Linear {

	public Pawn(String pieceName, String pieceColor, Node modelisationPiece) {
		super(pieceName, pieceColor, modelisationPiece);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public  ArrayList <Node> seePossibilities (GridPane board, int x, int y){
		ArrayList<Node> previsions = new ArrayList<Node>();
		moveUpLeft( board,x,y, previsions);
		moveUpRight(board, x,y, previsions);
		moveDownLeft(board, x,y, previsions);
		moveDownRight(board,x,y,  previsions);
		movetoTop(board, x,y,previsions);
		movetoBottom(board,x,y,previsions); 
		movetoLeft(board,x,y,previsions);
		movetoRight(board,x,y,previsions);
		return previsions;
	}
	

}
