package control;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import entities.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ProjectControl implements Initializable{

	@FXML TableView<Employee> tableEmployees;
	@FXML TableColumn<Employee, String> col_manv;
	@FXML TableColumn<Employee, String> col_ho;
	@FXML TableColumn<Employee, String> col_ten;
	@FXML TableColumn<Employee, String> col_gioitinh;
	@FXML TableColumn<Employee, String> col_ngaysinh;
	@FXML TableColumn<Employee, String> col_email;
	@FXML TableColumn<Employee, String> col_sdt;
	@FXML TableColumn<Employee, String> col_diachi;
	@FXML JFXButton btnAdd;
	
	ObservableList<Employee> emplist = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		col_manv.setCellValueFactory(new PropertyValueFactory<>("maNV"));
		col_ho.setCellValueFactory(new PropertyValueFactory<>("hoNV"));
		col_ten.setCellValueFactory(new PropertyValueFactory<>("tenNV"));
		col_gioitinh.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
		col_ngaysinh.setCellValueFactory(new PropertyValueFactory<>("ngaySinh"));
		col_email.setCellValueFactory(new PropertyValueFactory<>("email"));
		col_sdt.setCellValueFactory(new PropertyValueFactory<>("sdt"));
		col_diachi.setCellValueFactory(new PropertyValueFactory<>("diaChi"));
		
		tableEmployees.getItems().add(new Employee("NV01", "Khoa", "Cyruss", "Nam", LocalDate.of(1999, Month.OCTOBER, 2), "dinhdangkhoa0201@gmail.com", "0937602105", "Cu Chi"));
		tableEmployees.getItems().add(new Employee("NV01", "Khoa", "Cyruss", "Nam", LocalDate.of(1999, Month.OCTOBER, 2), "dinhdangkhoa0201@gmail.com", "0937602105", "Cu Chi"));
		
	}
	
	@FXML
	private void handleButtonAction(MouseEvent e) {
		if(e.getSource() == btnAdd) {
			try {
				Stage stage = new Stage();
				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/AddEmployee.fxml"));
				Parent root = fxmlLoader.load();
				stage.setScene(new Scene(root));
				stage.show();

			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
				System.out.println("Error Add Employee");
				e2.printStackTrace();
			}
		}
	}
	
}
