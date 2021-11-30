import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory {
	ArrayList<Guitar> guitarList;
	static ArrayList<Piano> pianoList = new ArrayList<Piano>();
	ArrayList<Drum> drumList;
	boolean isEmployee;
	String guitarFile;
	String pinaoFile;
	String drumFile;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rick's Guitar Shop!");
		//Just for test
		addPiano("12345", 12.5, Builder.GIBSON, "some model", PianoType.CONSOLE, Wood.ALDER);
	}

	public void loadGuitars() {
		
	}
	
	public void loadPiano() {
		
	}
	
	public void loadDrum() {
		
	}
	
	public void addGuitar(String serialNum, double price, Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
		guitarList.add(new Guitar(serialNum, price, builder, model, type, backWood, topWood));
		
	}
	
	public static void addPiano(String serialNum, double price, Builder builder, String model, PianoType type, Wood wood) {
		pianoList.add(new Piano(serialNum, price, builder, model, type, wood));
		try {
			FileWriter writer = new FileWriter("piano.txt");
			writer.write(serialNum + " " + price + " " + builder.toString() + " " + model + " " + type.toString() + " " + wood.toString());
			System.out.println(writer.toString());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}
	
	public void addDrum(String serialNum, double price, Builder builder, String model, DrumType type, Wood wood, DrumHead drumHead) {
		drumList.add(new Drum(serialNum, price, builder, model, type, wood, drumHead));
	}

	public Guitar getGuitar(String specs) {
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
