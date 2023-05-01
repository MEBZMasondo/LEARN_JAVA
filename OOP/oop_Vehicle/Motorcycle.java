package oop_Vehicle;

public class Motorcycle extends Vehicle {

	boolean hasSideCar;

	public Motorcycle(int registrationNumber, String owner, String ownerAddress, boolean hasSideCar) {
		super(registrationNumber, owner, ownerAddress);	
		this.hasSideCar = hasSideCar;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	@Override
	public String toString() {
		return "Motorcycle [registrationNumber=" + registrationNumber + ", owner=" + owner + ", ownerAddress="
				+ ownerAddress + "hasSideCar=" + hasSideCar + "]";
	}
	
	
}
