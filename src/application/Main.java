package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
			primaryStage.setTitle("CXL Adapter Command Utlity");
			//Image im = new Image("bulb2.PNG");
			//primaryStage.getIcons().add(im);
			primaryStage.setScene(new Scene(root));
			primaryStage.setMaximized(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
