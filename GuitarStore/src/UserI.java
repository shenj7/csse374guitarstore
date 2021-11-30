
public class UserI {
	public static void main(String[] args) {
		String search = "";
		Inventory currentInventory = new Inventory();
		System.out.println("Welcome to Rick's Guitar Shop!");
//		TODO: add scanners to check for responses
		System.out.println("Are you an employee? Y/N");
		System.out.println("Would you like to search for Drums, Guitars, or Pianos?");
		Spec spec = new GuitarSpec(null, null, null, null, null);
		if (search.contentEquals("Drums")) {
//			TODO: questions for drums
			spec = (GuitarSpec)null;
		}
		if (search.contentEquals("Guitars")) {
//			TODO: questions for drums
			spec = new GuitarSpec(null, null, null, null, null);
		}
		if (search.contentEquals("Pianos")) {
//			TODO: questions for drums
			spec = null;
		}
		currentInventory.search(spec);
	}
}
