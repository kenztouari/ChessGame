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
	for (int i=1; i<=y; i++) {
	if(x-i>=0 && y-i>=0) {
		if(previsions(board,x-i,y-i)==false) {
			previsions.add(lookForAPiece(board,x-i, y-i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x-i,y-i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x-i, y-i).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,x-i, y-i));
				previsions.add(getPieceOnTheWay(board,x-i, y-i));
			}
			break;
		}
	}
}
}

@Override 
public void moveUpRight(GridPane board, int x, int y,ArrayList<Node>previsions) {
	for (int i=1; i<=y; i++) {
	if(x+i<8 && y-i>=0) {
		if(previsions(board,x+i,y-i)==false) {previsions.add(lookForAPiece(board,x+i, y-i));
	}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+i,y-i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+i, y-i).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,x+i, y-i));
				previsions.add(getPieceOnTheWay(board,x+i, y-i));
		}
			break;
}
}
}
}

@Override
public void moveDownLeft(GridPane board, int x, int y,ArrayList<Node>previsions) {
	System.out.println("x ="+x);
	System.out.println("y ="+y);
	for (int i =1; i<8-y; i++) {
		System.out.println("i ="+i);
	if(x-i>=0 && y+i<8) {
		if(previsions(board,x-i,y+i)==false) {
			System.out.println("if ok1");
			previsions.add(lookForAPiece(board,x-i, y+i));
			System.out.println("if ok2");
		}
		else {
			System.out.println("else if ok");
			if(Controleur.findControleur(getPieceOnTheWay(board,x-i,y+i)).getColor()!=this.getColor()) {
				System.out.println("x= "+Controleur.findControleur(getPieceOnTheWay(board,x-i,y+i)));
				System.out.println("xfor ="+x);
				System.out.println("yfor ="+y);
				lookForAPiece(board, x-i, y+i).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,x-i, y+i));
				previsions.add(getPieceOnTheWay(board,x-i, y+i));
		}
		
			break;
	}
}
}
	
}

@Override
public void moveDownRight (GridPane board, int x, int y,ArrayList<Node>previsions) {
	for (int i =1; i<8-y; i++) {
	if(x+i<8 && y+i<8) {
		if(previsions(board,x+i,y+i)==false) {
			previsions.add(lookForAPiece(board,x+i, y+i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x+i,y+i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x+i, y+i).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,x+i, y+i));
				previsions.add(getPieceOnTheWay(board,x+i, y+i));
		}
			break;
	}
}
}	
}

@Override
public void movetoTop(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =y-1; i>=0; i--) {
		if(previsions(board,x,i)==false) {
			previsions.add(lookForAPiece(board,x, i));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,x,i)).getColor()!=this.getColor()) {
				lookForAPiece(board, x, i).setStyle("-fx-background-color : BURLYWOOD");
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
				lookForAPiece(board, x, i).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,x, i));
				previsions.add(getPieceOnTheWay(board,x, i));
		}
			break; 
		
	}
}
}


@Override
public void movetoLeft(GridPane board, int x,int y,ArrayList<Node>previsions) {
	for (int i =x-1; i>=0; i--) {
		if(previsions(board,i,y)==false) {
			previsions.add(lookForAPiece(board,i, y));
		}
		else {
			if(Controleur.findControleur(getPieceOnTheWay(board,i,y)).getColor()!=this.getColor()) {
				lookForAPiece(board, i, y).setStyle("-fx-background-color : BURLYWOOD");
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
				lookForAPiece(board, i, y).setStyle("-fx-background-color : BURLYWOOD");
				previsions.add(lookForAPiece(board,i, y));
				previsions.add(getPieceOnTheWay(board,i, y));
		}
		break;
	}

}
}

}
