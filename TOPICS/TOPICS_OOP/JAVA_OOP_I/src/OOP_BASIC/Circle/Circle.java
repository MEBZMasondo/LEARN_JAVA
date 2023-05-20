
class Circle {
	
	// DATA FIELDS
	private double radius = 1;
	
	// CONSTRUCTORS
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// GETTERS/ACCESSORS AND SETTERS/MUTATORS
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		
		try {
			if(radius > 0) { 
				this.radius = radius;
			} else {
				System.out.println("Please Enter a radius > 0");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	// METHODS
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	
}