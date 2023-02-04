package movements;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public interface Diagonal {
public void moveUpLeft(GridPane board, int x, int y, ArrayList<Node> previsions);
public void moveUpRight(GridPane board, int x, int y, ArrayList<Node> previsions);
public void moveDownLeft(GridPane board, int x, int y, ArrayList<Node> previsions);
public void moveDownRight(GridPane board, int x, int y, ArrayList<Node> previsions);

}
