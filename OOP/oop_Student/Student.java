package oop_Student;

import java.util.Objects;

public class Student {
	
	private String name;
	private double yearMark;
	
	public Student(String name, double yearMark) {
		super();
		this.name = name;
		this.yearMark = yearMark;
	}
	
	public String getName() {
		return name;
	}
	
	public double getYearMark() {
		return yearMark;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYearMark(double yearMark) {
		this.yearMark = yearMark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", yearMark=" + yearMark + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, yearMark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(yearMark) == Double.doubleToLongBits(other.yearMark);
	}
	

}
