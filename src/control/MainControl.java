package control;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainControl implements Initializable{

	@FXML AnchorPane main;
	@FXML JFXButton btnProfile;
	@FXML JFXButton btnEmployee;
	@FXML JFXButton btnCloseWindown;
	@FXML AnchorPane center;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	private void handleButtonAction(MouseEvent e) {
		if(e.getSource() == btnProfile) {
			try {
				center.getChildren().clear();
				Parent profile = FXMLLoader.load(getClass().getResource("/gui/Profile.fxml"));
				center.getChildren().add(profile);
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
				System.out.println("Error Profile");
				e2.printStackTrace();
			}
		}
		else if(e.getSource() == btnEmployee) {
			try {
				center.getChildren().clear();
				Parent employee = FXMLLoader.load(getClass().getResource("/gui/Employee.fxml"));
				center.getChildren().add(employee);
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
				System.out.println("Error Employee");
			}
		}
		else if(e.getSource() == btnCloseWindown) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Do you want to exit?");
			alert.setContentText("Are you sure?");

			ButtonType yesBtn = new ButtonType("Yes", ButtonData.YES);
			ButtonType noBtn = new ButtonType("No", ButtonData.NO);

			alert.getButtonTypes().setAll(yesBtn, noBtn);

			if(alert.showAndWait().get() == yesBtn)
				System.exit(0);
			else
				alert.close();
		}
	}

}
