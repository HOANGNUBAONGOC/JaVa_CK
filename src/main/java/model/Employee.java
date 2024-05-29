package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	private Integer id;
	private String fullname;
	private String gender;
	private String birth;
	private String position;
	private String status;
	private String address;
	private String email;
	private String phone;
	private int salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer id, String fullname, String gender, String birth, String position, String status,
			String address, String email, String phone, int salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.birth = birth;
		this.position = position;
		this.status = status;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

@Id//khóa chính
//@GeneratedValue // tự động tăng
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "NhanVienmodel [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", birth=" + birth
				+ ", position=" + position + ", status=" + status + ", address=" + address + ", email=" + email
				+ ", phone=" + phone + ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

