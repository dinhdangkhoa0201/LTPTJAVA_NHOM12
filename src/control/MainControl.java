package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainControl implements Initializable{

	@FXML AnchorPane main;
	@FXML JFXButton btnProfile;
	@FXML JFXButton btnEmployees;
	@FXML VBox vboxCenter;
	@FXML ScrollPane scrollPane;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void profile(ActionEvent e) throws IOException {
		scrollPane.setContent(null);
		Parent profile = FXMLLoader.load(getClass().getResource("/gui/Profile.fxml"));
	
		scrollPane.setContent(profile);
	}
	
	public void employees(ActionEvent e) throws IOException {
		scrollPane.setContent(null);
		Parent employees = FXMLLoader.load(getClass().getResource("/gui/Employees.fxml"));
	
		scrollPane.setContent(employees);
	}

}
