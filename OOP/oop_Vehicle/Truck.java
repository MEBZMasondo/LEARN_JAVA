package oop_Vehicle;

public class Truck extends Vehicle {

	int numberOfAxles;

	public Truck(int registrationNumber, String owner, String ownerAddress, int numberOfAxles) {
		super(registrationNumber, owner, ownerAddress);	
		this.numberOfAxles = numberOfAxles;
	}

	public int getNumberOfSamples() {
		return numberOfAxles;
	}

	public void setNumberOfSamples(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	@Override
	public String toString() {
		return "Truck [registrationNumber=" + registrationNumber + ", owner=" + owner + ", ownerAddress="
				+ ownerAddress + "numberOfAxles=" + numberOfAxles + "]";
	}
	
	
}
