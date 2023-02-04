package chessPieces;

import java.util.ArrayList;

import application.Controleur;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Diagonal;
import movements.Linear;

public class Queen extends Piece implements Diagonal, Linear{
	public Queen(String pieceName, Node pieceModelisation, String pieceColor) {
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
	for (int i=0; i<8; i++) {
	if(x-i>=0 && y-i>=0) {
		if(previsions(board,x-1,y-1)==false) {
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
	for (int i=0; i<8; i++) {
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
	for (int i =0; i<8; i++) {
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
	for (int i =0; i<8; i++) {
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
}

@Override
public void movetoTop(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =0; i<8; i++) {
	if(y-i>=0) {
		if(previsions(board,x,y-i)==false) {
			previsions.add(lookForAPiece(board,x, y-i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x,y-1)).getColor()!=this.getColor()) {
				lookForAPiece(board, x, y-i).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x, y-i));
				previsions.add(getPieceOnTheWay(board,x, y-i));
		}
		
	}
}
}
}


@Override
public void movetoBottom(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =0; i<8; i++) {
	if(y+i<8) {
		if(previsions(board,x,y-i)==false) {
			previsions.add(lookForAPiece(board,x, y+1));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x,y+i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x, y+i).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x, y+i));
				previsions.add(getPieceOnTheWay(board,x, y+i));
		}
		
	}
}
}
}

@Override
public void movetoLeft(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =0; i<8; i++) {
	if(x-i>=0) {
		if(previsions(board,x-i,y)==false) {
			previsions.add(lookForAPiece(board,x-i, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-i,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-1, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x-i, y));
				previsions.add(getPieceOnTheWay(board,x-i, y));
		}
		
	}
}
}
}

@Override
public void movetoRight(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =0; i<8; i++) {
	if(x+i<8) {
		if(previsions(board,x+1,y)==false) {
			previsions.add(lookForAPiece(board,x+i, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+i,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+i, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,x+i, y));
				previsions.add(getPieceOnTheWay(board,x+i, y));
		}
		
	}
}
}
}

}
