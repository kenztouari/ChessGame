package application;

import javafx.scene.control.MenuButton;
import javafx.scene.layout.VBox;

public class Menu {
	public Menu() {
		VBox menu0 = new VBox(20);
		VBox menu1 = new VBox(20); 
		
		// setting buttons for the first interface 
		MenuButton btnPlay = new MenuButton ("PLAY");
		MenuButton btnRestart = new MenuButton ("RESTART");
		MenuButton btnExit = new MenuButton ("EXIT");
		MenuButton btnOptions = new MenuButton ("RULES");
	}

}
