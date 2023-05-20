
public class StudentTest {  
    public static void main(String[] args) {
		
		// Test Student
		Student stu_one = new Student("Adam", 220001); 
        System.out.println(stu_one.toString());
		System.out.println();
		
		// Test Student : empty constructor
		Student stu_two = new Student();	
		//System.out.println(stu_two.toString()); // will give String as null, int as 0
		stu_two.setStuName("Eve");
		stu_two.setStuNumber(220002);
		System.out.println(stu_two.toString());
		System.out.println();
		
		// Test Honours Student
		Student stu_three = new StudentHonours("Jacob", 220003, "Internet Of Things"); // or StudentHonours stu_three = new StudentHonours("Jacob", 220003, "Internet Of Things");
		System.out.println(stu_three.toString());
		System.out.println();
		
		// Test Honours Student : empty constructor
		StudentHonours stu_four = new StudentHonours();
		//System.out.println(stu_four.toString()); // will give String as null, int as 0
		stu_four.setStuName("Mariam");
		stu_four.setStuNumber(220004);
		stu_four.setPaperTopic("Automata theory");
		System.out.println(stu_four.toString());
		
    }
}
