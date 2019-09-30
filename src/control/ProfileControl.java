package control;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class ProfileControl implements Initializable{

	@FXML JFXComboBox<String> cbxGioiTinh;
	
	ObservableList<String> gioiTinh = FXCollections.observableArrayList("Nam", "Nữ");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cbxGioiTinh.setItems(gioiTinh);
	}

}
