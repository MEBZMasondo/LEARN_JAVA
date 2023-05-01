package oop_Student;

public class StudentTest {

	public static void main(String[] args) {
		
		System.out.println("Student Object");	
		Student s1 = new Student("studentEddie1", 95);
		System.out.println(s1.toString());
		System.out.println( "OBJECT OF STUDENT ? :\t" + (s1 instanceof Student));
		
		System.out.println("\nHonours Student Object");	
		Student h1 = new HonoursStudent("honourStudentEddie1", 98, "ML");
		System.out.println(h1.toString());
		System.out.println( "OBJECT OF HONOURSSTUDENT ? :\t" + (h1 instanceof Student));
		
		System.out.println("\nHonours Student Object");
		HonoursStudent h2 = new HonoursStudent("honoursStudentEddie2", 90, "AI");
		System.out.println(h2.toString());
		System.out.println( "OBJECT OF HONOURSSTUDENT ? :\t" + (h2 instanceof Student));
	}

}
