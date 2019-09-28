package control;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import entities.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class LoginControl implements Initializable{
	
	@FXML private JFXTextField txtUser;
	@FXML private JFXPasswordField txtPassword;
	@FXML private JFXButton btnSignIn;
	@FXML private JFXButton btnSignUp;
	private SessionFactory sessionFactory;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	@FXML
	void handleButtonAction(MouseEvent e) {
		if(e.getSource() == btnSignIn) {
			login();
		}
		else if(e.getSource() == btnSignUp) {
			System.out.println("Sign Up");
		}
	}
	
	public LoginControl() {
		// TODO Auto-generated constructor stub

	}
	
	public void login() {
		String user = txtUser.getText().toString();
		String password = txtPassword.getText().toString();
		if(getUser(user, password)) {
			System.out.println("Login Success");
		}
		else {
			System.out.println("Error");
		}
	}
	
	public boolean getUser(String user, String password) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List list = session.createQuery("FROM User WHERE user like :user and password like:password")
				.setParameter("user", user).setParameter("password", password).list();
		if(list.isEmpty())
			return false;
		return true;
	}
	
}
