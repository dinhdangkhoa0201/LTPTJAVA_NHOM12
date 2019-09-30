package main;
	
import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Employee;
import entities.User;
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/gui/Login.fxml"));
			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Screen screen = Screen.getPrimary();
//			Rectangle2D bounds = screen.getVisualBounds();
			primaryStage.initStyle(StageStyle.UNDECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void main(String[] args) {
		launch(args);
	}
}
