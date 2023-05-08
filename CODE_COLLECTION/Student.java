class Student {
	
	private String stuName;
	private int stuNumber;	
	
	public Student() {
	}
	
	public Student(String stuName, int stuNumber) {
		this.stuName = stuName;
		this.stuNumber = stuNumber;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public void setStuNumber(int stuNumber) {
		this.stuNumber = stuNumber;
	}
	
	public String getStuName() {
		return this.stuName;
	}
	
	public int getStuNumber() {
		return this.stuNumber;
	}
	
	public String toString() {
		return "TYPE: STUDENT \n" + "NAME: " + this.getStuName() + "\nSTU NUMBER: " + this.getStuNumber(); 
	}
}