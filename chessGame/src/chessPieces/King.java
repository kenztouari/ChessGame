package chessPieces;

import java.util.ArrayList;

import application.Controleur;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Diagonal;
import movements.Linear;

public class King extends Piece implements Diagonal, Linear{
	public King(String pieceName, Node pieceModelisation, String pieceColor) {
		super(pieceName,pieceColor,pieceModelisation);
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

@Override 
public void moveUpLeft(GridPane board, int x, int y,ArrayList<Node>previsions) {
	if(x-1>=0 && y-1>=0) {
		if(previsions(board,x-1,y-1)==false) {
			previsions.add(lookForAPiece(board,x-1, y-1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-1,y-1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-1, y-1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x-1, y-1));
				previsions.add(getPieceOnTheWay(board,x-1, y-1));
			}
		}
	}
}
@Override 
public void moveUpRight(GridPane board, int x, int y,ArrayList<Node>previsions) {
	if(x+1<8 && y-1<8) {
		if(previsions(board,x+1,y-1)==false) {previsions.add(lookForAPiece(board,x+1, y-1));
	}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+1,y-1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+1, y-1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+1, y-1));
				previsions.add(getPieceOnTheWay(board,x+1, y-1));
		}
}
}
}

@Override
public void moveDownLeft(GridPane board, int x, int y,ArrayList<Node>previsions) {
	if(x-1>=0 && y+1<8) {
		if(previsions(board,x-1,y+1)==false) {
			previsions.add(lookForAPiece(board,x+1, y-1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-1,y+1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-1, y+1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x-1, y+1));
				previsions.add(getPieceOnTheWay(board,x-1, y+1));
		}
	}
}
}

@Override
public void moveDownRight (GridPane board, int x, int y,ArrayList<Node>previsions) {
	if(x+1<8 && y+1<8) {
		if(previsions(board,x+1,y+1)==false) {
			previsions.add(lookForAPiece(board,x+1, y+1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+1,y+1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+1, y+1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+1, y+1));
				previsions.add(getPieceOnTheWay(board,x+1, y+1));
		}
	}
}
}	

@Override
public void movetoTop(GridPane board, int x,int y,ArrayList<Node>previsions) {
	if(y-1>=0) {
		if(previsions(board,x,y-1)==false) {
			previsions.add(lookForAPiece(board,x, y-1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x,y-1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x, y-1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x, y-1));
				previsions.add(getPieceOnTheWay(board,x, y-1));
		}
		
	}
}

}

@Override
public void movetoBottom(GridPane board, int x,int y,ArrayList<Node>previsions) {
	if(y+1<8) {
		if(previsions(board,x,y-1)==false) {
			previsions.add(lookForAPiece(board,x, y+1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x,y+1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x, y+1).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x, y+1));
				previsions.add(getPieceOnTheWay(board,x, y+1));
		}
		
	}
}
}


@Override
public void movetoLeft(GridPane board, int x,int y,ArrayList<Node>previsions) {
	if(x-1>=0) {
		if(previsions(board,x-1,y)==false) {
			previsions.add(lookForAPiece(board,x-1, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-1,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-1, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x-1, y));
				previsions.add(getPieceOnTheWay(board,x-1, y));
		}
		
	}
}
}

@Override
public void movetoRight(GridPane board, int x,int y,ArrayList<Node>previsions) {
	if(x+1<8) {
		if(previsions(board,x+1,y)==false) {
			previsions.add(lookForAPiece(board,x+1, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+1,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+1, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+1, y));
				previsions.add(getPieceOnTheWay(board,x+1, y));
		}
		
	}
}
}


}