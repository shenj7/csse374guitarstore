import java.util.ArrayList;

public class Inventory {
	ArrayList<Guitar> guitarList;
	boolean isEmployee;
	String guitarFile;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rick's Guitar Shop!");
	}

	public void loadGuitars() {
		
	}
	
	public void addGuitar(String serialNum, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		guitarList.add(new Guitar(serialNum, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String specs) {
		return null;
	}

	public Guitar[] search(GuitarSpec spec) {
		return null;
	}
}
