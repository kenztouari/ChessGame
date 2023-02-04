package chessPieces;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Diagonal;

public class Bishop extends Piece implements Diagonal{

	public Bishop(String pieceName, String pieceColor, Node modelisationPiece) {
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
}
	@Override 
	public void moveUpLeft(GridPane board, int x, int y,ArrayList<Node>previsions) {
		for (int i=0; i<y; i++) {
			if(x-i>=0 && y-i>=0) {
				if(previsions(board,x-i,y-i)==false ) {
					previsions.add(lookForAPiece(board,x-i, y-i));
				}
				else {
					if(Controleur.findControleur(getPieceOnTheWay(board,x-i,y-i)).getColor()!=this.getColor()) {
						lookForAPiece(board, x-i, y-i).setStyle("-fx-background-color : GREY");
						previsions.add(lookForAPiece(board,x-i, y-i));
						previsions.add(getPieceOnTheWay(board,x-i, y-i));
					}
				}
			}
		}
	}

@Override 
public void moveUpRight(GridPane board, int x, int y,ArrayList<Node>previsions) {
	for (int i=0; i<y; i++) {
	if(x+i<8 && y-i<8) {
		if(previsions(board,x+i,y-i)==false) {previsions.add(lookForAPiece(board,x+1, y-1));
	}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+i,y-i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+1, y-1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+i, y-i));
				previsions.add(getPieceOnTheWay(board,x+i, y-i));
		}
}
}
}
}

@Override
public void moveDownLeft(GridPane board, int x, int y,ArrayList<Node>previsions) {
	for (int i =0; i<y; i++) {
	if(x-i>=0 && y+i<8) {
		if(previsions(board,x-i,y+i)==false) {
			previsions.add(lookForAPiece(board,x+i, y-i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-i,y+i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-i, y+i).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x-i, y+i));
				previsions.add(getPieceOnTheWay(board,x-i, y+i));
		}
	}
}
}
}

@Override
public void moveDownRight (GridPane board, int x, int y,ArrayList<Node>previsions) {
	for (int i =0; i<y; i++) {
	if(x+i<8 && y+i<8) {
		if(previsions(board,x+i,y+i)==false) {
			previsions.add(lookForAPiece(board,x+i, y+i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+i,y+i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+i, y+i).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+i, y+i));
				previsions.add(getPieceOnTheWay(board,x+i, y+i));
		}
	}
}
}		
	
	
	
}}

