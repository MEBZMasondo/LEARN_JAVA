package oop_Vehicle;

public class Car  extends Vehicle {
	
	int numberOfDoors;

	public Car(int registrationNumber, String owner, String ownerAddress, int numberOfDoors) {
		super(registrationNumber, owner, ownerAddress);	
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", owner=" + owner + ", ownerAddress="
				+ ownerAddress + "numberOfDoors=" + numberOfDoors + "]";
	}

	

}
