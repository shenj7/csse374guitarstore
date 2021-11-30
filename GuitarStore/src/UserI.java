
public class UserI {
	public static void main(String[] args) {
		String search = "";
		Inventory currentInventory = new Inventory();
		System.out.println("Welcome to Rick's Guitar Shop!");
//		TODO: add scanners to check for responses
		System.out.println("Are you an employee? Y/N");
		System.out.println("Would you like to search for Drums, Guitars, or Pianos?");
		if (search.contentEquals("Drums")) {
//			TODO: questions for drums
			DrumSpec spec = null;
			currentInventory.search(spec);
		}
		if (search.contentEquals("Guitars")) {
//			TODO: questions for drums
			GuitarSpec spec = null;;
			currentInventory.search(spec);
		}
		if (search.contentEquals("Pianos")) {
//			TODO: questions for drums
			PianoSpec spec = null;
			currentInventory.search(spec);
		}
	}
}