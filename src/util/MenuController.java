package src.util;

import src.game.Screen;
import src.object.ScrConst;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController{
    @FXML
    Button start = new Button();
    @FXML
    Button exit = new Button();

    @FXML
    void initialize(){
        
    }

    public void onStartPressed(){
        Screen screen = new Screen(ScrConst.width, ScrConst.length);
        screen.start();
    }
    public void onExitPressed(){
        Snake
    }
    
}
