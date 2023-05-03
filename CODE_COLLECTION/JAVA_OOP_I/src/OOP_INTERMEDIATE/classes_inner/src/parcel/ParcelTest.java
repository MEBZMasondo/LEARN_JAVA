
public class ParcelTest {
	public static void main(String[] args) {
		
		Parcel p = new Parcel("Bruce Wayne"); // Create a parcel object
		p.ship("Durban");		// Ship the Parcel to durban
		
		System.out.println(p.toString());
		
	}
}