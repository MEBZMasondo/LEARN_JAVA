
public class CircleTest {
	
	public static void main(String[] args) {
		
		// Using Empty Constructor
		Circle c1 = new Circle();
		System.out.println("C1 Radius \t= " + c1.getRadius());
		System.out.println("C1 Area \t= " + c1.getArea());
		System.out.println("C1 Perimeter\t= " + c1.getPerimeter());
		
		// Using Constructor with a parameter 
		Circle c2 = new Circle(5);
		System.out.println("C2 Radius \t= " + c2.getRadius());
		System.out.println("C2 Area \t= " + c2.getArea());
		System.out.println("C2 Perimeter\t= " + c2.getPerimeter());
		
	}
}