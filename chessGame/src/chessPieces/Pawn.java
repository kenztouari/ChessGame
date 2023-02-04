package chessPieces;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Diagonal;
import movements.Linear;

public class Pawn extends Piece {

	public Pawn(String pieceName, String pieceColor, Node modelisationPiece) {
		super(pieceName, pieceColor, modelisationPiece);
		// TODO Auto-generated constructor stub
	}
	

	@Override 
	public ArrayList <Node> seePossibilities (GridPane board, int x, int y){
		ArrayList <Node> previsions = new ArrayList<Node>();
		if(this.getColor().equals("white")) {
			if(previsions(board,x,y+1)==false) {
				previsions.add(lookForAPiece(board,x,y+1));
				if(previsions(board,x,y+2)==false) {
					previsions.add(lookForAPiece(board,x,y+2));	
				}
			}
			if(previsions(board,x,y,1,1)==true) {
				previsions.add(lookForAPiece(board,x+1,y+1));
				previsions.add(lookForAPiece(board,x+1,y+1));
			}
			if(previsions(board,x,y,-1,1)==true) {
				previsions.add(lookForAPiece(board,x-1,y+1));
				previsions.add(lookForAPiece(board,x-1,y+1));
			}
		}
		
		else {
			if(previsions(board, x,y-1)==false) {
				previsions.add(lookForAPiece(board,x,y-1));
					if (previsions(board,x, y-2)==false) {
						previsions.add(lookForAPiece(board, x, y-2));
					}
		}
			if(previsions(board,x,y,1,-1)==true) {
				previsions.add(lookForAPiece(board,x+1,y-1));
				previsions.add(lookForAPiece(board,x+1,y-1));
			}
			if(previsions(board,x,y,-1,-1)==true) {
				previsions.add(lookForAPiece(board,x-1,y-1));
				previsions.add(lookForAPiece(board,x-1,y-1));
			}
	}
		return previsions; 
		}
	
	public boolean previsions(GridPane board, int x, int y, int otherX, int otherY) {
		if(getPieceOnTheWay(board,x,y)!=null) {
			if(Controleur.findControleur(getPieceOnTheWay(board, x+otherX, y+otherY).getColor()!=this.getColor())) {
				return false; 
			}
			lookForAPiece(board, otherX+x,otherY+y).setStyle("-fx-backrground-color:GREY");
		}
	}
}
