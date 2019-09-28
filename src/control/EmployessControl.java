package control;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployessControl implements Initializable{

	@FXML TableView<Employee> tableEmployees;
	@FXML TableColumn<Employee, String> col_manv;
	@FXML TableColumn<Employee, String> col_hoten;
	@FXML TableColumn<Employee, String> col_gioitinh;
	@FXML TableColumn<Employee, String> col_ngaysinh;
	@FXML TableColumn<Employee, String> col_email;
	@FXML TableColumn<Employee, String> col_sdt;
	@FXML TableColumn<Employee, String> col_diachi;
	
	ObservableList<Employee> emplist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TO DO Auto-generated method stub
		col_manv.setCellValueFactory(new PropertyValueFactory<>(""));
	}
	
}
