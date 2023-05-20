
public class Main {
    public static void main(String[] args) throws Exception {
        
      //----------------------------------------------------------------------------------------------------------------------------
      // BASIC VEHICLE CLASS
	   
	   System.out.println("CLASS VEHICLE");
	  
      Vehicle v1 = new Vehicle(1110, "Edison", "30 LongStreet, NY");
      System.out.println(v1);      
      
      // Objects know the class to which they belong
      // Testing to see what class an object belongs to 
      if(v1 instanceof Vehicle)
         System.out.println("v1 : I am a Vehicle");
      if(v1 instanceof Car)
    	  System.out.println("v1 : I am a Car"); // not true
      if(v1 instanceof Truck)
    	  System.out.println("v1 : I am a Truck"); // not true
      if(v1 instanceof Motorcycle)
    	  System.out.println("v1 : I am a Motorcycle"); // not true
      
      printLine();
      
      //----------------------------------------------------------------------------------------------------------------------------
      // CAR
      
      System.out.println("CLASS CAR");
      
      Vehicle c1 = new Car(1111, "Edwin", "31 LongStreet, NY", 5); // By Substitution rule
      System.out.println(c1.toString()); 
      if(c1 instanceof Vehicle)
         System.out.println("c1 is a Vehicle");
      if(c1 instanceof Car)
         System.out.println("c1 is a Car");
      if(c1 instanceof Truck)
    	  System.out.println("c1 : I am a Truck");
      if(c1 instanceof Motorcycle)
    	  System.out.println("c1 : I am a Motorcycle");

      
      
      Car c2 = new Car(1112, "Edward", "32 LongStreet, NY", 5);
      System.out.println(c2.toString());
      
      /* SUBSTITUTION
      A variable that can hold a reference to an object of class A, 
      can also hold a reference to an object belonging to any subclass of A. */
      
      printLine();
      //----------------------------------------------------------------------------------------------------------------------------
      // TRUCK
      
      System.out.println("CLASS TRUCK");
      
      Vehicle t1 = new Truck(1113, "Eddy", "31 LongStreet, NY", 5); // By Substitution rule
      System.out.println(t1.toString()); 
      if(t1 instanceof Vehicle)
         System.out.println("t1 is a Vehicle");
      if(t1 instanceof Car)
         System.out.println("t1 is a Car");
      if(t1 instanceof Truck)
    	  System.out.println("t1 : I am a Truck");
      if(t1 instanceof Motorcycle)
    	  System.out.println("t1 : I am a Motorcycle");
      
      printLine();
      //----------------------------------------------------------------------------------------------------------------------------
      // MOTORCYCLE
      
      System.out.println("CLASS MOTORCYCLE");

      Vehicle m1 = new Motorcycle(1114, "Edwin", "31 LongStreet, NY", false); // By Substitution rule
      System.out.println(m1.toString()); 
      if(m1 instanceof Vehicle)
         System.out.println("m1 is a Vehicle");
      if(m1 instanceof Car)
         System.out.println("m1 is a Car");
      if(m1 instanceof Truck)
    	  System.out.println("m1 : I am a Truck");
      if(m1 instanceof Motorcycle)
    	  System.out.println("m1 : I am a Motorcycle");
      
      printLine();
      //----------------------------------------------------------------------------------------------------------------------------
      // MIXED 
      // Arrays of Type Vehicle
      
      System.out.println("MIXED : ARRAY OF TYPE VEHICLE");
      int max = 4;
      Vehicle [] v_arr = new Vehicle[max];
      
      v_arr[0] = new Vehicle(100, "Adam", "1 Rain Str");
      v_arr[1] = new Car(101, "Belinda", "2 Rain Str", 2);
      v_arr[2] = new Truck(102, "Calvin", "3 Rain Str", 4);
      v_arr[3] = new Motorcycle(103, "Daniel", "4 Rain Str", true);
      
      for (int i = 0; i < max; i++) {
    	  System.out.println(v_arr[i].registrationNumber + " : " + v_arr[i].toString());
      }
      
      printLine();
      
      //----------------------------------------------------------------------------------------------------------------------------
      // PARAMETER PASSING
      
      System.out.println("PARAMETER PASSING");
      
      
      printLine();
      
      //----------------------------------------------------------------------------------------------------------------------------
      // TYPE-CASTING OBJECTS
      
      /*A subclass reference can be assigned to a superclass variable; BUT a superclass reference cannot be assigned to a subclass variable.
		You can say Vehicle myVehicle = myCar;
		but not:
			Car myCar = new Vehicle();
			nor myCar = myVehicle;
		even if myVehicle holds a reference to a Car object.
		Illegal because myVehicle could potentially refer to other types of vehicles that are not cars.
		You are not allowed to assign a value of type Vehicle to a variable of type Car because not every vehicle is a car.
      */
      
      /* 
       * If you know that myVehicle refers to a Car, you can use the type cast (Car)myVehicle to tell the compiler to treat myVehicle as if it were actually of type Car.
       */
      
      System.out.println("TYPE CASTING");
      
      Vehicle myVehicle = new Vehicle(1010, "Edwin", "Brown street");
      Car myCar = new Car(200, "Adam", "1 Snow Str", 5);
      
      myVehicle = new Car(201, "Belinda", "2 Snow Str", 5); //legal
      myVehicle = myCar; //legal
      myCar.setOwner("Albert"); //legal
      ((Car)myVehicle).setNumberOfDoors(2); //legal
      myCar = (Car)myVehicle; //legal
      
      System.out.println(myVehicle.toString());

      printLine();
      
      //----------------------------------------------------------------------------------------------------------------------------
    }

    static void skipLine() {
        System.out.println();
    }
    
    static void printLine() {
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }

}
