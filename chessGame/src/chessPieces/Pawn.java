package chessPieces;

import java.util.ArrayList;

import application.Controleur;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Linear;

public class Pawn extends Piece  {

	public Pawn(String pieceName, String pieceColor, Node modelisationPiece) {
		super(pieceName, pieceColor, modelisationPiece);
		// TODO Auto-generated constructor stub
	}
	

	public void movetoBottom(GridPane board, int x,int y,ArrayList<Node>previsions) {
		System.out.println("y"+y);
		for (int i =y+1; i<y+3; i++) {
			if(previsions(board,x,i)==false) {
				previsions.add(lookForAPiece(board,x, i));
			}
			else {
				if(Controleur.findControleur(getPieceOnTheWay(board,x,i)).getColor()!=this.getColor()) {
					lookForAPiece(board, x, i).setStyle("-fx-background-color : GREY");
					previsions.add(lookForAPiece(board,x, i));
					previsions.add(getPieceOnTheWay(board,x, i));
			}
				break; 
			
		}
	}
	}
	public void movetoTop(GridPane board, int x,int y,ArrayList<Node>previsions) {
		for (int i =y-1; i>y-3; i--) {
			if(previsions(board,x,i)==false) {
				previsions.add(lookForAPiece(board,x, i));
			}
			else {
				if(Controleur.findControleur(getPieceOnTheWay(board,x,i)).getColor()!=this.getColor()) {
					lookForAPiece(board, x, i).setStyle("-fx-background-color : GREY");
					previsions.add(lookForAPiece(board,x, i));
					previsions.add(getPieceOnTheWay(board,x, i));
			}
				break;
			
		}
	}
	}
	@Override 
	public ArrayList <Node> seePossibilities (GridPane board, int x, int y){
		ArrayList <Node> previsions = new ArrayList<Node>();
		if(this.getColor().equals("white")) {
			System.out.println("on est blancs");
			movetoBottom(board,  x,y,previsions) ;
		}
		
		else {
			System.out.println("on est noirs");
			movetoTop(board, x,y,previsions) ;
			
	}
		return previsions; 
		}
	
	public boolean previsions(GridPane board, int x, int y, int otherX, int otherY) {
		if(getPieceOnTheWay(board,x+otherX,y+otherY)!=null) {
			if(Controleur.findControleur(getPieceOnTheWay(board, x+otherX, y+otherY)).getColor()==this.getColor()) {
				return false; 
			}
			lookForAPiece(board, otherX+x,otherY+y).setStyle("-fx-backrground-color:GREY");
		}
		return false; 
	}

}
