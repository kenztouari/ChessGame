package chessPieces;

import java.util.ArrayList;

import application.Controleur;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class Horseman extends Piece {
	public Horseman(String pieceName, String pieceColor, Node modelisationPiece) {
		super(pieceName, pieceColor, modelisationPiece);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public  ArrayList <Node> seePossibilities (GridPane board, int x, int y){
		ArrayList<Node> previsions = new ArrayList<Node>();
		if(x-2>=0 &&y-1>=0) {
			previsions.add(lookForAPiece(board, x-2,y-1));
				System.out.println("piece = "+getPieceOnTheWay(board, x-2,y-1));
				if(previsions(board, x-2,y-1)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x-2,y-1)).getColor()!=this.getColor()) {
					lookForAPiece(board, x-2,y-1).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x-2,y-1));
				}
			}
			if(x-2>=0 && y+1<8) {
				previsions.add(lookForAPiece(board, x-2,y+1));
				System.out.println("piece= "+getPieceOnTheWay(board, x-2,y+1));
				if(previsions(board, x-2,y+1)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x-2,y+1)).getColor()!=this.getColor()) {
					lookForAPiece(board, x-2,y+1).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x-2,y+1));
			}
		}
			if(x-1>=0 && y-2>=0) {
				previsions.add(lookForAPiece(board, x-1,y-2));
				System.out.println("piece= "+getPieceOnTheWay(board, x-1,y+1));
				if(previsions(board, x-1,y-2)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x-1,y-2)).getColor()!=this.getColor()) {
					lookForAPiece(board, x-1,y-2).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x-1,y-2));
				
			}
			}
			if(x-1>=0 && y+2<8) {
				previsions.add(lookForAPiece(board, x-1,y+2));
				System.out.println("piece= "+getPieceOnTheWay(board, x-1,y+1));
				if(previsions(board, x-1,y+2)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x-1,y+2)).getColor()!=this.getColor()) {
					lookForAPiece(board, x-1,y+2).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x-1,y+2));
				
			}
			}
			if(x+1<8 && y-2>=0) {
				previsions.add(lookForAPiece(board, x+1,y-2));
				System.out.println("piece= "+getPieceOnTheWay(board, x+1,y-2));
				if(previsions(board, x+1,y-2)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x+1,y-2)).getColor()!=this.getColor()) {
					lookForAPiece(board, x+1,y-2).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x+1,y-2));
				
			}
			}
			if(x+1<8 && y+2<8) {
				previsions.add(lookForAPiece(board, x+1,y+2));
				System.out.println("piece= "+getPieceOnTheWay(board, x+1,y+2));
				if(previsions(board, x+1,y+2)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x+1,y+2)).getColor()!=this.getColor()) {
					lookForAPiece(board, x+1,y+2).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x+1,y+2));
			}
			}
			if(x+2<8 && y-1>=0) {
				previsions.add(lookForAPiece(board, x+2,y-1));
				System.out.println("piece= "+getPieceOnTheWay(board, x+2,y-1));
				if(previsions(board, x+2,y-1)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x+2,y-1)).getColor()!=this.getColor()) {
					lookForAPiece(board, x+2,y-1).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x+2,y-1));
			}
			}
			if(x+2<8 && y+1<8) {
				previsions.add(lookForAPiece(board, x+2,y+1));
				System.out.println("piece= "+getPieceOnTheWay(board, x+2,y+1));
				if(previsions(board, x+2,y+1)==true &&
						Controleur.findControleur(getPieceOnTheWay(board, x+2,y+1)).getColor()!=this.getColor()) {
					lookForAPiece(board, x+2,y+1).setStyle("-fx-background-color : BURLYWOOD");
					previsions.add(getPieceOnTheWay(board,x+2,y+1));
			}
			}
			return previsions;
	}
}

