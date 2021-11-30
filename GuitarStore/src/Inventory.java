import java.util.ArrayList;

public class Inventory {
	ArrayList<Guitar> guitarList;
	ArrayList<Piano> pianoList;
	ArrayList<Drum> drumList;
	boolean isEmployee;
	String guitarFile;
	String pinaoFile;
	String drumFile;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rick's Guitar Shop!");
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
	
	public void addPiano(String serialNum, double price, Builder builder, String model, PianoType type, Wood wood) {
		pianoList.add(new Piano(serialNum, price, builder, model, type, wood));
	}
	
	public void addDrum(String serialNum, double price, Builder builder, String model, DrumType type, Wood wood, DrumHead drumHead) {
		drumList.add(new Drum(serialNum, price, builder, model, type, woodm drumHead));
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
