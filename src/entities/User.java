package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name = "User")
	private String user;
	
	@Column(name = "Password", nullable = false)
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNV")
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public User(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public User() {
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + "]";
	}
}
