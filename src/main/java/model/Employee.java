package model;


public class Employee {
	private String ID;
	private String FullName;
	private String Gender;
	private String DateofBirth;
	private String Position;
	private String Status;
	private String Address;
	private String Email;
	private String PhoneNumber;
	private int Salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String iD, String fullName, String gender, String dateofBirth, String position, String status,
			String address, String email, String phoneNumber, int salary) {
		super();
		ID = iD;
		FullName = fullName;
		Gender = gender;
		DateofBirth = dateofBirth;
		Position = position;
		Status = status;
		Address = address;
		Email = email;
		PhoneNumber = phoneNumber;
		Salary = salary;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getFullName() {
		return FullName;
	}


	public void setFullName(String fullName) {
		FullName = fullName;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getDateofBirth() {
		return DateofBirth;
	}


	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}


	public String getPosition() {
		return Position;
	}


	public void setPosition(String position) {
		Position = position;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	
}

