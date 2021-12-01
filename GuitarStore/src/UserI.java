import java.io.IOException;

public class UserI {
	public static void main(String[] args) {
		String instrument = "";
		Inventory currentInventory = new Inventory();
		Boolean isEmployee = true;
		currentInventory.addPiano("12345", 12.5, Builder.GIBSON, "Somemodel", PianoType.CONSOLE, Wood.ALDER);
		currentInventory.addGuitar("23456", 13, Builder.YAMAHA, "SomeModel", GuitarType.ACOUSTIC, Wood.KOA, Wood.BASSWOOD);
		currentInventory.addGuitar("23412456", 13, Builder.YAMAHA, "SomeModel", GuitarType.ACOUSTIC, Wood.KOA, Wood.BASSWOOD);
		currentInventory.addDrum("34567", 14, Builder.GIBSON, "SomeModel", DrumType.ELECTRONIC, Wood.WALNUT, DrumHead.AMBASSADOR);
		try {
			currentInventory.loadGuitars();
			currentInventory.loadPianos();
			currentInventory.loadDrums();
			
		} catch (IOException e) {
			System.out.println("Cannot load guitars");
			e.printStackTrace();
		}
		System.out.println("Welcome to Rick's Guitar Shop!");
//		TODO: add scanners to check for responses
		System.out.println("Are you an employee? Y/N");
		if (isEmployee) {
			System.out.println("Would you like to add or remove an instrument?");
			System.out.println("What kind of instrument would you like to edit?(Drums, Guitars, or Pianos)");
			if (instrument.equals("Drums")) {
//				TODO: drum actions
			}
			if (instrument.equals("Guitars")) {
//				TODO: guitar actions
			}
			if (instrument.equals("Pianos")) {
//				TODO: piano actions
			}
		} else { // Customer View
			System.out.println("Would you like to search for Drums, Guitars, or Pianos?");
			if (instrument.equals("Drums")) {
//			TODO: questions for drums
				DrumSpec spec = null;
				currentInventory.search(spec);
			}
			if (instrument.equals("Guitars")) {
//			TODO: questions for guitars
				GuitarSpec spec = null;
				currentInventory.search(spec);
			}
			if (instrument.equals("Pianos")) {
//			TODO: questions for pianos
				PianoSpec spec = null;
				currentInventory.search(spec);
			}
		}
	}
}