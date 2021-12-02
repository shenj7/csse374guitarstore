import java.io.IOException;
import java.util.Scanner;

public class UserI {
	public static void main(String[] args) {
		String instrument = "";
		Inventory currentInventory = new Inventory();
		Boolean isEmployee;
		currentInventory.addPiano("12345", 12.5, Builder.GIBSON, "Somemodel", PianoType.CONSOLE, Wood.ALDER);
		currentInventory.addGuitar("23456", 13, Builder.YAMAHA, "SomeModel", GuitarType.ACOUSTIC, Wood.KOA,
				Wood.BASSWOOD);
		currentInventory.addGuitar("23412456", 13, Builder.YAMAHA, "SomeModel", GuitarType.ACOUSTIC, Wood.KOA,
				Wood.BASSWOOD);
		currentInventory.addDrum("34567", 14, Builder.GIBSON, "SomeModel", DrumType.ELECTRONIC, Wood.WALNUT,
				DrumHead.AMBASSADOR);
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you an employee?");
		while (!scanner.hasNext("[YN]")) { // regex for y/n
			System.out.println("Y/N?");
			scanner.next();
		}
		isEmployee = scanner.next().equals("Y");
		if (isEmployee) { // Employee View
			System.out.println("Would you like to add an instrument? (Y/N)");
			while (!scanner.hasNext("[YN]")) { // regex for y/n
				System.out.println("Y/N?");
				scanner.next();
			}
			if (scanner.next() == "N") {
				scanner.close();
				return;
			}
			System.out.println("What kind of instrument would you like to add? (D)rums, (G)uitars, or (P)ianos");
			while (!scanner.hasNext("[DGP]")) { // repeat until we get drums, guitars, or pianos
				System.out.println("G/D/P?");
				scanner.next();
			}
			instrument = scanner.next();
			if (instrument.equals("D")) {
//				TODO: drum actions
				System.out.println("Serial Number: ");
				String serialNum = scanner.next();
				
				System.out.println("Price: ");
				double price = Double.parseDouble(scanner.next());
				System.out.println("Builder: ");
				Builder builder = Builder.valueOf(scanner.next().toUpperCase());
				System.out.println("Model: ");
				String model = scanner.next();
				System.out.println("Drum Type: ");
				DrumType type = DrumType.valueOf(scanner.next().toUpperCase());
				System.out.println("Wood: ");
				Wood wood =  Wood.valueOf(scanner.next().toUpperCase());
				System.out.println("Drum Head: ");
				DrumHead drumHead = DrumHead.valueOf(scanner.next().toUpperCase());
				currentInventory.addDrum(serialNum, price, builder, model, type, wood, drumHead);
				System.out.println(currentInventory.drumList);
			}
			if (instrument.equals("G")) {
//				TODO: guitar actions
			}
			if (instrument.equals("P")) {
//				TODO: piano actions
			}
		} else { // Customer View
			System.out.println("Would you like to search for (D)rums, (G)uitars, or (P)ianos?");
			while (!scanner.hasNext("[DGP]")) { // repeat until we get drums, guitars, or pianos
				System.out.println("G/D/P?");
				scanner.next();
			}
			instrument = scanner.next();
			if (instrument.equals("D")) {
//			TODO: questions for drums
				System.out.println("Builder: ");
				Builder builder = Builder.valueOf(scanner.next().toUpperCase());
				System.out.println("Model: ");
				String model = scanner.next();
				System.out.println("Drum Type: ");
				DrumType type = DrumType.valueOf(scanner.next().toUpperCase());
				System.out.println("Wood: ");
				Wood wood =  Wood.valueOf(scanner.next().toUpperCase());
				System.out.println("Drum Head: ");
				DrumHead drumHead = DrumHead.valueOf(scanner.next().toUpperCase());
				DrumSpec spec = new DrumSpec(builder, model, type, wood, drumHead);
				System.out.println(currentInventory.search(spec).toString());
			}
			if (instrument.equals("G")) {
//			TODO: questions for guitars
				System.out.println("Builder: ");
				Builder builder = Builder.valueOf(scanner.next().toUpperCase());
				System.out.println("Model: ");
				String model = scanner.next();
				System.out.println("Guitar Type: ");
				GuitarType type = GuitarType.valueOf(scanner.next().toUpperCase());
				System.out.println("Back Wood: ");
				Wood backWood =  Wood.valueOf(scanner.next().toUpperCase());
				System.out.println("Top Wood: ");
				Wood topWood = Wood.valueOf(scanner.next().toUpperCase());
				GuitarSpec spec = new GuitarSpec(builder, model, type, backWood, topWood);
				System.out.println(currentInventory.search(spec).toString());
//				System.out.println(currentInventory.search(spec).toString());
			}
			if (instrument.equals("P")) {
//			TODO: questions for pianos
				System.out.println("Builder: ");
				Builder builder = Builder.valueOf(scanner.next().toUpperCase());
				System.out.println("Model: ");
				String model = scanner.next();
				System.out.println("Piano Type: ");
				PianoType type = PianoType.valueOf(scanner.next().toUpperCase());
				System.out.println("Wood: ");
				Wood wood =  Wood.valueOf(scanner.next().toUpperCase());
				PianoSpec spec = new PianoSpec(builder, model, type, wood);
				System.out.println(currentInventory.search(spec).toString());
			}
		}
		scanner.close();
	}
}