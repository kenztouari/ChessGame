package chessPieces;

import java.util.ArrayList;

import application.Controleur;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import movements.Linear;

public class Rook extends Piece implements Linear {
	public Rook (String pieceName, Node pieceModelisation, String pieceColor) {
		super(pieceName,pieceColor,pieceModelisation);
	}
@Override 
public  ArrayList <Node> seePossibilities (GridPane board, int x, int y){
	ArrayList<Node> previsions = new ArrayList<Node>();
	movetoTop(board, x,y,previsions);
	movetoBottom(board,x,y,previsions); 
	movetoLeft(board,x,y,previsions);
	movetoRight(board,x,y,previsions);
	return previsions;
}

@Override
public void movetoTop(GridPane board, int x,int y,ArrayList<Node>previsions) {
	
	for (int i =y-1; i>=0; i--) {
	if(previsions(board,x,y-i)==false) {
		previsions.add(lookForAPiece(board,x, y-i));
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
public void movetoBottom(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =y+1; i<8; i++) {
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

public void movetoLeft(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =x-1; i>=0; i--) {
		if(previsions(board,i,y)==false) {
			previsions.add(lookForAPiece(board,i, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,i,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, i, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,i, y));
				previsions.add(getPieceOnTheWay(board,i, y));
		}
			break;
		
	}
}
}


@Override
public void movetoRight(GridPane board, int x,int y,ArrayList<Node>previsions) {
	System.out.println("xxxxxxxxxxx="+x);
	for (int i =x+1; i<8; i++) {

		if(previsions(board,i,y)==false) {
			System.out.println("i="+i);
			previsions.add(lookForAPiece(board,i, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,i,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, i, y).setStyle("-fx-background-color : GREY");
				previsions.add(lookForAPiece(board,i, y));
				previsions.add(getPieceOnTheWay(board,i, y));
		}
		break;
	}

}
}

}

