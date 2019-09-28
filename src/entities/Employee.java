package entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "MaNV")
	private String maNV;
	
	@Column(name = "HoNV")
	private String hoNV;
	
	@Column(name = "TenNV")
	private String tenNV;
	
	@Column(name = "GioiTinh")
	private String gioiTinh;
	
	@Column(name = "NgaySinh")
	private LocalDate ngaySinh;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Employee(String maNV, String hoNV, String tenNV, String gioiTinh, LocalDate ngaySinh, String email,
			String diaChi) {
		super();
		this.maNV = maNV;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.email = email;
		this.diaChi = diaChi;
	}
	public Employee() {
		super();
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoNV() {
		return hoNV;
	}
	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "Employee [maNV=" + maNV + ", hoNV=" + hoNV + ", tenNV=" + tenNV + ", gioiTinh=" + gioiTinh
				+ ", ngaySinh=" + ngaySinh + ", email=" + email + ", diaChi=" + diaChi + "]";
	}
	
	
}
