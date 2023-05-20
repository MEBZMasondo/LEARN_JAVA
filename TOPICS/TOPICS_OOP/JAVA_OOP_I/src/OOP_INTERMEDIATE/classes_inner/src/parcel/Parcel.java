/* Parcel class
	A parcel (main)class can have inner classes:
		Content inner class
		Destination inner class
*/ 
public class Parcel { 
	
	private String ownerName; // Name of the parcel owner
	Content c = null;
	Destination d = null;
	
	public Parcel(String ownerName) {
		this.ownerName = ownerName;
	}
	
	// Content inner class - Part of Parcel class
	class Content {
		public int quantity;
		
		public Content() {
			this.quantity = 0;
		}
		
		public int getQuantity() { 
			return quantity; 
		}  
		
		public void setQuantity(int quantity) { 
			this.quantity = quantity; 
		}
		
	}
   
	// Destination inner class - Part of Parcel class
	class Destination {
		private String location;
      
		Destination(String location) {
			this.location = location;
		}
      
		String getLocation() { 
			return this.location;
		}
	}
   
	// Using inner classes looks like using any other class, within Parcel
	public void ship(String dest) {
		c = new Content();				// Create Content object
		d = new Destination(dest);	// Create Destination object	
	} 
	
	public String toString() {
		String parcelInfo = "";
		
		parcelInfo += "-- PARCEL INFORMATION --\n";
		parcelInfo += "LOCATION\t " + d.getLocation() + "\n";
		
		return parcelInfo;
	}

}