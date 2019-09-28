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
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public static void main(String[] args) {
		EntityManager database = Persistence.createEntityManagerFactory("LTPTJAVA_NHOM12").createEntityManager();
		EntityTransaction transaction = database.getTransaction();
		
		Employee employee = new Employee("NV01", "Khoa", "Cyruss", "Name", LocalDate.of(1999, Month.OCTOBER, 2), "dinhdangkhoa0201@gmail.com", "Củ Chi");
		
		User user = new User();
		user.setPassword("025825273a");
		
		employee.setUser(user);
		try {
			transaction.begin();
			database.persist(user);
			database.persist(employee);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
			e.printStackTrace();
		}
		launch(args);
	}
}
