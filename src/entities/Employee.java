package entities;

import java.time.LocalDate;

public class Employee {
	private String maNV;
	private String hoNV;
	private String tenNV;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String email;
	private String diaChi;
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
