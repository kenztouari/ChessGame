package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import chessPieces.Bishop;
import chessPieces.Horseman;
import chessPieces.King;
import chessPieces.Pawn;
import chessPieces.Piece;
import chessPieces.Queen;
import chessPieces.Rook;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Controleur implements Initializable  {
private static boolean whitePlay; 
private static ArrayList<Piece> pieceBoard=new ArrayList<Piece>();
private static Piece pieceToPlay; 
private static ArrayList<Node>previsions= new ArrayList<Node>();
@FXML
private GridPane board; 
@FXML
private Label piece_57;
@FXML
private Label piece_20;
@FXML
private Label piece_11;
@FXML
private Label piece_40;
@FXML
private Label piece_31;
@FXML
private Label piece_60;
@FXML
private Label piece_71;
@FXML
private Label piece_51;
@FXML
private Label piece_42;
@FXML
private Label piece_62;
@FXML
private Label piece_13;
@FXML
private Label piece_33;
@FXML
private Label piece_53;
@FXML
private Label piece_73;
@FXML
private Label piece_04;
@FXML
private Label piece_24;
@FXML
private Label piece_44;
@FXML
private Label piece_64;
@FXML
private Label piece_15;
@FXML
private Label piece_35;
@FXML
private Label piece_55;
@FXML
private Label piece_75;
@FXML
private Label piece_06;
@FXML
private Label piece_26;
@FXML
private Label piece_46;
@FXML
private Label piece_66;
@FXML
private Label piece_37;
@FXML
private Label piece_17;
@FXML
private Label piece_00;
@FXML
private Label piece_77;
@FXML
private Label piece_02;
@FXML
private Label piece_10;
@FXML
private Label piece_21;
@FXML
private Label piece_30;
@FXML
private Label piece_01;
@FXML
private Label piece_12;
@FXML
private Label piece_03;
@FXML
private Label piece_14;
@FXML
private Label piece_05;
@FXML
private Label piece_16;
@FXML
private Label piece_07;
@FXML
private Label piece_27;
@FXML
private Label piece_25;
@FXML
private Label piece_23;
@FXML
private Label piece_32;
@FXML
private Label piece_34;
@FXML
private Label piece_47;
@FXML
private Label piece_36;
@FXML
private Label piece_41;
@FXML
private Label piece_43;
@FXML
private Label piece_45;
@FXML
private Label piece_50;
@FXML
private Label piece_52;
@FXML
private Label piece_54;
@FXML
private Label piece_56;
@FXML
private Label piece_61;
@FXML
private Label piece_70;
@FXML
private Label piece_72;
@FXML
private Label piece_63;
@FXML
private Label piece_65;
@FXML
private Label piece_74;
@FXML
private Label piece_76;
@FXML
private Label piece_67;



//white pawns 
@FXML
private ImageView whitePawn_1; 
@FXML
private ImageView whitePawn_2; 
@FXML
private ImageView whitePawn_3; 
@FXML
private ImageView whitePawn_4; 
@FXML
private ImageView whitePawn_5;
@FXML
private ImageView whitePawn_6;
@FXML
private ImageView whitePawn_7; 
@FXML
private ImageView whitePawn_8; 


//black pawns 

@FXML
private ImageView blackPawn_1;
@FXML
private ImageView blackPawn_2;
@FXML
private ImageView blackPawn_3; 
@FXML
private ImageView blackPawn_4; 
@FXML
private ImageView blackPawn_5;
@FXML
private ImageView blackPawn_6;
@FXML
private ImageView blackPawn_7; 
@FXML
private ImageView blackPawn_8; 

//white rooks
@FXML
private ImageView whiteRook_1;
@FXML
private ImageView whiteRook_2;

//black rooks 
@FXML
private ImageView blackRook_1;
@FXML
private ImageView blackRook_2;

//white Horsemans
@FXML
private ImageView whiteHorseman_1; 
@FXML
private ImageView whiteHorseman_2; 

//black Horsemans 
@FXML
private ImageView blackHorseman_1; 
@FXML
private ImageView blackHorseman_2; 

// black Queen 
@FXML
private ImageView blackQueen;

//white Queen
@FXML
private ImageView whiteQueen; 

// black King 
@FXML
private ImageView blackKing;

// white King 
@FXML
private ImageView whiteKing; 

// white bishop 
@FXML
private ImageView whiteBishop_1; 
@FXML
private ImageView whiteBishop_2; 

// black bishop 
@FXML
private ImageView blackBishop_1; 
@FXML
private ImageView blackBishop_2; 


@FXML
private Button btnWhiteSurrender;

@FXML
private Button btnDraw;

@FXML
private Button btnBlackSurrender;

// 
@FXML
void blackSurrender (MouseEvent event) {
	try {
		pieceToPlay = null; 
		previsions.clear(); 
		Stage stage=(Stage) piece_00.getScene().getWindow();
		stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("whitewin.fxml"));
		Scene scene = new Scene(root);
		Stage newWindow = new Stage();
		newWindow.setTitle("White win");
		newWindow.setScene(scene);
		newWindow.show();
	}
	catch(IOException e ) {
		e.printStackTrace(); 
	}
}
	
@FXML
 void draw(MouseEvent event) {
	 
try{
	pieceToPlay = null; 

	previsions.clear(); 
	Stage stage=(Stage) piece_00.getScene().getWindow();
	stage.close();
	Parent root = FXMLLoader.load(getClass().getResource("whitewin.fxml"));
	Scene scene = new Scene(root);
	Stage newWindow = new Stage();
	newWindow.setTitle("White win");
	newWindow.setScene(scene);
	newWindow.show();
}
catch(IOException e ) {
	e.printStackTrace(); 
}
 }
@FXML
 void whiteSurrender(MouseEvent event) {
	 try{
			pieceToPlay = null; 

			previsions.clear(); 
			Stage stage=(Stage) piece_00.getScene().getWindow();
			stage.close();
			Parent root = FXMLLoader.load(getClass().getResource("blackwin.fxml"));
			Scene scene = new Scene(root);
			Stage newWindow = new Stage();
			newWindow.setTitle("Black win");
			newWindow.setScene(scene);
			newWindow.show();
		}
		catch(IOException e ) {
			e.printStackTrace(); 
		}
		 }
 

@FXML
void showPossibilities (MouseEvent event ) {
	Node source =(Node)event.getSource(); 
	if(Piece.lookForAPiece(
		    board, 
			getValue(GridPane.getColumnIndex(source)),
			getValue(GridPane.getRowIndex(source))).getStyle()
				.equals("-fx-background-color:GREY")){
	
		takePiece((Label)Piece.lookForAPiece(board,getValue(GridPane.getColumnIndex(source)) ,getValue(GridPane.getRowIndex(source))));
		if(whitePlay==false) {
			whitePlay=true; 
		}
		else {
			whitePlay=false; 
		}
	}
	else {
		stopPrevision();
		int x= getValue(GridPane.getColumnIndex(source));
		int y= getValue(GridPane.getRowIndex(source));
		
		if(findControleur(source)!=null) {
			pieceToPlay=findControleur(source); 
			if(whitePlay==true && pieceToPlay.getColor().equals("white")) {
				previsions=pieceToPlay.seePossibilities(board, x,y);
			}
			else if( whitePlay==false && pieceToPlay.getColor().equals("black")) {
				previsions= pieceToPlay.seePossibilities(board, x, y);}
			}
	}
}

public static Piece findControleur(Node source) {
	for (int i =0; i<Controleur.pieceBoard.size(); i++) {
		if(source.getId().toString().equals(Controleur.pieceBoard.get(i).toString())) {
			return Controleur.pieceBoard.get(i);
		}
	}
	return null;
	
}

public static int getValue(Object valeur) {
	if(valeur instanceof Integer) {
		return (int) valeur;
	}
	return 0;
}

public void takePiece(Label piece) {
	for(int i=0; i<Controleur.previsions.size(); i++) {
		if(previsions.get(i)==piece) {
			if(i+1<Controleur.previsions.size() && previsions.get(i+1) instanceof ImageView) {
				if(win(findControleur(previsions.get(i+1)))==false ){
					board.getChildren().remove(previsions.get(i+1));
					pieceToPlay.Move(board,  getValue(GridPane.getColumnIndex(piece)), getValue(GridPane.getRowIndex(piece)));
					stopPrevision();
				}
			}
			break; 
		}
	}
			
}
public void stopPrevision() {
	for (int i=0; i<Controleur.previsions.size(); i++) {
		if(previsions.get(i) instanceof Label) {
			if((getValue(GridPane.getColumnIndex(previsions.get(i)))%2==0 && getValue(GridPane.getRowIndex(previsions.get(i)))%2!=0) 
				||(getValue(GridPane.getColumnIndex(previsions.get(i)))%2!=0 && getValue(GridPane.getRowIndex(previsions.get(i)))%2==0)){
				Controleur.previsions.get(i).setStyle("-fx-background-color: brown");
			}
			else {
				Controleur.previsions.get(i).setStyle("-fx-background : white");	
}
		}
	}
	Controleur.previsions.removeAll(Controleur.previsions);
}


public boolean win ( Piece piece ) {
	if(piece.toString().equals("blackKing")) {
		pieceToPlay=null; 
		previsions.clear();
		pieceBoard.clear();
		try {
			Stage stage = (Stage) piece_00.getScene().getWindow(); 
			stage.close();
			Parent root = FXMLLoader.load(getClass().getResource("whitewin.fxml"));
			Scene scene = new Scene(root);
			Stage newWindow = new Stage();
			newWindow.setTitle("White win");
			newWindow.setScene(scene);
			newWindow.show();
			return true;
			
		}
		catch(IOException e ) {
			e.printStackTrace(); 
		}
	}
	return false; 
}

@FXML 
void Act(MouseEvent event ) {
	Label piece = (Label) event.getSource();
	if (piece.getStyle().equals("-fx-backrground-color : GREY")) {
		Node piece_cell=(Node)event.getSource();
		int x=getValue(GridPane.getColumnIndex(piece_cell));
		int y=getValue(GridPane.getRowIndex(piece_cell));
		pieceToPlay.Move(board, x,y);
		pieceToPlay=null; 
		if(whitePlay==false) {
			whitePlay= true;
		}
		else {
			whitePlay=false;
		}
	}
	else {
		pieceToPlay= null; 
		stopPrevision();
	}
}

@Override 
public void initialize( URL arg0, ResourceBundle arg1) {
	whitePlay=true; 
	this.whitePawn_1 = new Pawn("whitePawn_1","white", whitePawn_1);
	this.whitePawn_2 = new Pawn("whitePawn_1","white", whitePawn_2);
	this.whitePawn_3 = new Pawn("whitePawn_1","white", whitePawn_3);
	this.whitePawn_4 = new Pawn("whitePawn_1","white", whitePawn_4);
	this.whitePawn_5 = new Pawn("whitePawn_1","white", whitePawn_5);
	this.whitePawn_6 = new Pawn("whitePawn_1","white", whitePawn_6);
	this.whitePawn_7 = new Pawn("whitePawn_1","white", whitePawn_7);
	this.whitePawn_8 = new Pawn("whitePawn_1","white", whitePawn_8);
	
	this.blackPawn_1 = new Pawn("blackPawn_1","black", blackPawn_1);
	this.blackPawn_2 = new Pawn("blackPawn_1","black", blackPawn_2);
	this.blackPawn_3 = new Pawn("blackPawn_1","black", blackPawn_3);
	this.blackPawn_4 = new Pawn("blackPawn_1","black", blackPawn_4);
	this.blackPawn_5 = new Pawn("blackPawn_1","black", blackPawn_5);
	this.blackPawn_6 = new Pawn("blackPawn_1","black", blackPawn_6);
	this.blackPawn_7 = new Pawn("blackPawn_1","black", blackPawn_7);
	this.blackPawn_8 = new Pawn("blackPawn_1","black", blackPawn_8);

	
	this.whiteRook_1= new Rook( "whiteRook_1", whiteRook_1, "white"); 
	this.whiteRook_2=new Rook( "whiteRook_1", whiteRook_2, "white"); 
	this.blackRook_1= new Rook( "blackRook_1", blackRook_1, "black"); 
	this.blackRook_2=new Rook( "blackRook_1", blackRook_2, "black"); 

	this.whiteHorseman_1=new Horseman("whiteHorseman_1", "white", whiteHorseman_1); 
	this.whiteHorseman_2=new Horseman("whiteHorseman_2", "white", whiteHorseman_2); 
	
	this.blackHorseman_1=new Horseman("blackHorseman_1", "black", blackHorseman_1); 
	this.blackHorseman_2=new Horseman("blackHorseman_2", "black", blackHorseman_2); 
	
	this.whiteKing = new King ( "whiteKing", whiteKing, "white");
	this.blackKing = new King ("blackKing", blackKing, "black"); 
	
	this.blackBishop_1  = new Bishop( "blackBishop_1","black",blackBishop_1);
	this.blackBishop_2 = new Bishop( "blackBishop_2","black",blackBishop_2);
	
	this.whiteBishop_1 = new Bishop( "whiteBishop_1","white",whiteBishop_1);
	this.whiteBishop_2 = new Bishop( "whiteBishop_2","white",whiteBishop_2);

	this.whiteQueen = new Queen( "whiteQueen",whiteQueen,"white");
	this.blackQueen = new Queen( "blackQueen",blackQueen,"black");

	Controleur.pieceBoard.add((Piece)whitePawn_1);
	Controleur.pieceBoard.add((Piece)whitePawn_2);
	Controleur.pieceBoard.add((Piece)whitePawn_3);
	Controleur.pieceBoard.add((Piece)whitePawn_4);
	Controleur.pieceBoard.add((Piece)whitePawn_5);
	Controleur.pieceBoard.add((Piece)whitePawn_6);
	Controleur.pieceBoard.add((Piece)whitePawn_7);
	Controleur.pieceBoard.add((Piece)whitePawn_8);
	
	Controleur.pieceBoard.add((Piece)blackPawn_1);
	Controleur.pieceBoard.add((Piece)blackPawn_2);
	Controleur.pieceBoard.add((Piece)blackPawn_3);
	Controleur.pieceBoard.add((Piece)blackPawn_4);
	Controleur.pieceBoard.add((Piece)blackPawn_5);
	Controleur.pieceBoard.add((Piece)blackPawn_6);
	Controleur.pieceBoard.add((Piece)blackPawn_7);
	Controleur.pieceBoard.add((Piece)blackPawn_8);

	 Controleur.pieceBoard.add((Piece)whiteBishop_1);
	 Controleur.pieceBoard.add((Piece)whiteBishop_2);
	 Controleur.pieceBoard.add((Piece)blackBishop_1);
	 Controleur.pieceBoard.add((Piece)blackBishop_2);

	 Controleur.pieceBoard.add((Piece)blackRook_1);
	 Controleur.pieceBoard.add((Piece)blackRook_2);
	 
	 Controleur.pieceBoard.add((Piece)whiteRook_1);
	 Controleur.pieceBoard.add((Piece)whiteRook_2);

	 Controleur.pieceBoard.add((Piece)whiteHorseman_1);
	 Controleur.pieceBoard.add((Piece)whiteHorseman_2);
	 
	 Controleur.pieceBoard.add((Piece)blackHorseman_1);
	 Controleur.pieceBoard.add((Piece)blackHorseman_2);

	 Controleur.pieceBoard.add((Piece)blackQueen);
	 Controleur.pieceBoard.add((Piece)whiteQueen);
	 Controleur.pieceBoard.add((Piece)blackKing);
	 Controleur.pieceBoard.add((Piece)whiteKing);
}
}
