package oop_Vehicle;

public class Vehicle {
	
	// Properties
	int registrationNumber;
	String owner;
	String ownerAddress;
	
	// Constructors
	public Vehicle() {
		
	}
	
	public Vehicle(int registrationNumber, String owner, String ownerAddress) {
		this.registrationNumber = registrationNumber;
		this.owner = owner;
		this.ownerAddress = ownerAddress;
	}
	
	// getters and setters
	public int getRegistrationNumber() {
		return registrationNumber;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getOwnerAddress() {
		return ownerAddress;
	}
	
	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	
	// methods
	public void transferOwnership(String newOwner, String newOwnerAddress) {
		this.owner = newOwner;
		this.ownerAddress = newOwnerAddress;
	}
	
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", owner=" + owner + ", ownerAddress="
				+ ownerAddress + "]";
	}
	
	

}
