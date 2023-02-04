package movements;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public interface Linear {
	public void movetoTop(GridPane board, int x, int y, ArrayList<Node> previsions);
	public void movetoBottom(GridPane board, int x, int y, ArrayList<Node> previsions);
	public void movetoLeft(GridPane board, int x, int y, ArrayList<Node> previsions);
	public void movetoRight(GridPane board, int x, int y, ArrayList<Node> previsions);
}
