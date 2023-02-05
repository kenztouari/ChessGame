package chessPieces;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Piece extends ImageView  {
	private String pieceName; 
	private String pieceColor; 
	private Node modelisationPiece;

	
	public Piece (String pieceName, String pieceColor, Node modelisationPiece){
		this.pieceName = pieceName; 
		this.pieceColor= pieceColor; 
		this.modelisationPiece= modelisationPiece;
	}
	
	public Node getModelisationPiece() {
		return modelisationPiece; 
		}
	
	public String getColor() {
		return this.pieceColor; 
	}
	 
	@Override 
	public String toString() {
		return pieceName; 
	}
	
	public static Node lookForAPiece(GridPane board, int col, int row) {
		for (Node node : board.getChildren()){
			Integer columnIndex = GridPane.getColumnIndex(node);
			Integer rowIndex = GridPane.getRowIndex(node);
			if (columnIndex==null) {
				columnIndex=0; 
			}
			if(rowIndex==null) {
				rowIndex=0; 
			}
			if(rowIndex==col && columnIndex==row) {
				return (node);
			}
		}
		return null; 
	}
	
	public static Node getPieceOnTheWay(GridPane board, int col, int row) {
		ObservableList<Node>recapBoard = board.getChildren(); 
		FilteredList<Node>piecesOnTheBoard = new FilteredList<Node>(recapBoard);
		for (Node node : piecesOnTheBoard) {
			if(node instanceof ImageView) {
				Integer columnIndex = GridPane.getColumnIndex(node);
				Integer rowIndex = GridPane.getRowIndex(node);
				
				if (columnIndex==null) {
					columnIndex=0; 
				}
				
				if(rowIndex==null) {
					rowIndex=0; 
			}
				if(rowIndex==col && columnIndex==row) {
					return (node);
				}
		}
		}
		return null;
	}
	
	public boolean previsions(GridPane board, int x, int y ) {
		if(getPieceOnTheWay(board,x,y)==null) {
			lookForAPiece(board,x,y).setStyle("-fx-background-color : GREY");
			return false;
		}
		return true; 
	}
	
	public void Move(GridPane board, int x, int y) {
		GridPane.setColumnIndex(this.getModelisationPiece(),x);
		GridPane.setColumnIndex(this.getModelisationPiece(), y);
	}

	
	
	public abstract ArrayList <Node> seePossibilities (GridPane board, int x, int y);
	
}
