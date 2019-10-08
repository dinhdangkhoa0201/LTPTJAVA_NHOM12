package control;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddEmployeeControl implements Initializable{
	@FXML JFXButton btnCloseWindown;
	@FXML JFXButton btnRemove;
	@FXML JFXButton btnUpdate;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void handleButtonAction(MouseEvent e) {
		if(e.getSource() == btnCloseWindown) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Do you want to exit?");
			alert.setContentText("Are you sure?");

			ButtonType yesBtn = new ButtonType("Yes", ButtonData.YES);
			ButtonType noBtn = new ButtonType("No", ButtonData.NO);

			alert.getButtonTypes().setAll(yesBtn, noBtn);

			if(alert.showAndWait().get() == yesBtn) {
				Node node = (Node) e.getSource();
				Stage stage = (Stage) node.getScene().getWindow();
				stage.close();
			}
			else
				alert.close();
		}
		else if(e.getSource() == btnRemove){
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Do you want to delete this employee?");
			alert.setContentText("Are you sure?");

			ButtonType yesBtn = new ButtonType("Yes", ButtonData.YES);
			ButtonType noBtn = new ButtonType("No", ButtonData.NO);

			alert.getButtonTypes().setAll(yesBtn, noBtn);

			if(alert.showAndWait().get() == yesBtn)
				System.out.println("Remove Employee");
			else
				alert.close();
		}
		else if(e.getSource() == btnUpdate) {
			System.out.println("Update");
		}
	}

}
