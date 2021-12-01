import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	static ArrayList<Guitar> guitarList = new ArrayList<Guitar>();
	static ArrayList<Piano> pianoList = new ArrayList<Piano>();
	static ArrayList<Drum> drumList = new ArrayList<Drum>();
	boolean isEmployee;
	String guitarFile;
	String pianoFile;
	String drumFile;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rick's Guitar Shop!");
		//initialize inventory
		try {
            File file = new File("piano.txt");
            Scanner s = new Scanner(file);

            while(s.hasNext()) {
            	String piano = s.nextLine();
            	System.out.println(piano);
            }
            s.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		//Just for test
		addPiano("12345", 12.5, Builder.GIBSON, "Somemodel", PianoType.CONSOLE, Wood.ALDER);
		addGuitar("23456", 13, Builder.YAMAHA, "SomeModel", GuitarType.ACOUSTIC, Wood.KOA, Wood.BASSWOOD);
		addDrum("34567", 14, Builder.GIBSON, "SomeModel", DrumType.ELECTRONIC, Wood.WALNUT, DrumHead.AMBASSADOR);
	}

	public void loadGuitars() throws IOException {
		try (BufferedReader reader  = new BufferedReader(new FileReader("guitar.txt"))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
		       String[] props = line.split("[,]");
		       String serialNum = props[0];
		       double price = Double.parseDouble(props[1]);
		       Builder builder = Builder.valueOf(props[2]);
		       String model = props[3];
		       GuitarType type = GuitarType.valueOf(props[4]);
		       Wood topWood = Wood.valueOf(props[5]);
		       Wood backWood = Wood.valueOf(props[6]);
		       guitarList.add(new Guitar(serialNum, price, builder, model, type, topWood, backWood));
		    }
			System.out.println(guitarList);
		} catch (FileNotFoundException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}
	
	public void loadPiano() {
		
	}
	
	public void loadDrum() {
		
	}
	
	public static void addGuitar(String serialNum, double price, Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
		guitarList.add(new Guitar(serialNum, price, builder, model, type, backWood, topWood));
		try {
			FileWriter writer = new FileWriter("guitar.txt");
			writer.write(serialNum + "," + price + "," + builder.toString() + "," + model + "," + type.toString() + "," + backWood.toString() + "," + topWood.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}
	
	public static void addPiano(String serialNum, double price, Builder builder, String model, PianoType type, Wood wood) {
		pianoList.add(new Piano(serialNum, price, builder, model, type, wood));
		try {
			FileWriter writer = new FileWriter("piano.txt");
			writer.write(serialNum + "," + price + "," + builder.toString() + "," + model + "," + type.toString() + "," + wood.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}
	
	public static void addDrum(String serialNum, double price, Builder builder, String model, DrumType type, Wood wood, DrumHead drumHead) {
		drumList.add(new Drum(serialNum, price, builder, model, type, wood, drumHead));
		try {
			FileWriter writer = new FileWriter("drum.txt");
			writer.write(serialNum + "," + price + "," + builder.toString() + "," + model + "," + type.toString() + "," + wood.toString() + "," + drumHead.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}

	public Guitar getGuitar(String specs) { // return with serial number
		return null;
	}
	
	public Piano getPiano(String specs) {
		return null;
	}
	
	public Drum getDrum(String specs) {
		return null;
	}

	public ArrayList<Guitar> search(GuitarSpec spec) {
		return null;
	}
	
	public ArrayList<Piano> search(PianoSpec spec) {
		return null;
	}
	
	public ArrayList<Drum> search(DrumSpec spec) {
		return null;
	}
}
