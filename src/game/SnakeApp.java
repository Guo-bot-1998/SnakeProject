package src.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SnakeApp extends Application{
	
	public static Scene menuScene;
		
	@Override
	public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../Resource/fxml/menu.fxml"));
		Parent root = loader.load();
		menuScene = new Scene(root);
		
		primaryStage.setTitle("GreedySnake");
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}

}
