import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory {
	ArrayList<Guitar> guitarList = new ArrayList<Guitar>();
	ArrayList<Piano> pianoList = new ArrayList<Piano>();
	ArrayList<Drum> drumList = new ArrayList<Drum>();
	boolean isEmployee;
	String guitarFile;
	String pianoFile;
	String drumFile;

	public void loadGuitars() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("guitar.txt"))) {
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
		} catch (FileNotFoundException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		} finally {
			guitarList.remove(guitarList.size() - 1);
			System.out.println(guitarList);
		}
	}

	public void loadDrums() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("drum.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] props = line.split("[,]");
				String serialNum = props[0];
				double price = Double.parseDouble(props[1]);
				Builder builder = Builder.valueOf(props[2]);
				String model = props[3];
				DrumType type = DrumType.valueOf(props[4]);
				Wood wood = Wood.valueOf(props[5]);
				DrumHead drumHead = DrumHead.valueOf(props[6]);
				drumList.add(new Drum(serialNum, price, builder, model, type, wood, drumHead));
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		} finally {
			drumList.remove(drumList.size() - 1);
			System.out.println(drumList);
		}
	}

	public void loadPianos() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("piano.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] props = line.split("[,]");
				String serialNum = props[0];
				double price = Double.parseDouble(props[1]);
				Builder builder = Builder.valueOf(props[2]);
				String model = props[3];
				PianoType type = PianoType.valueOf(props[4]);
				Wood wood = Wood.valueOf(props[5]);
				pianoList.add(new Piano(serialNum, price, builder, model, type, wood));
			}
		} catch (FileNotFoundException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		} finally {
			pianoList.remove(pianoList.size() - 1);
			System.out.println(pianoList);
		}
	}

	public void addGuitar(String serialNum, double price, Builder builder, String model, GuitarType type, Wood backWood,
			Wood topWood) {
		guitarList.add(new Guitar(serialNum, price, builder, model, type, backWood, topWood));
		try {
			FileWriter writer = new FileWriter("guitar.txt");
			writer.write(serialNum + "," + price + "," + builder.toString().toUpperCase() + "," + model + ","
					+ type.toString().toUpperCase() + "," + backWood.toString().toUpperCase() + ","
					+ topWood.toString().toUpperCase());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}

	public void addPiano(String serialNum, double price, Builder builder, String model, PianoType type, Wood wood) {
		pianoList.add(new Piano(serialNum, price, builder, model, type, wood));
		try {
			FileWriter writer = new FileWriter("piano.txt");
			writer.write(serialNum + "," + price + "," + builder.toString().toUpperCase() + "," + model + "," + type.toString().toUpperCase() + ","
					+ wood.toString().toUpperCase());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}

	public void addDrum(String serialNum, double price, Builder builder, String model, DrumType type, Wood wood,
			DrumHead drumHead) {
		drumList.add(new Drum(serialNum, price, builder, model, type, wood, drumHead));
		try {
			FileWriter writer = new FileWriter("drum.txt");
			writer.write(serialNum + "," + price + "," + builder.toString().toUpperCase() + "," + model + "," + type.toString().toUpperCase() + ","
					+ wood.toString().toUpperCase() + "," + drumHead.toString().toUpperCase());
			writer.close();
		} catch (IOException e) {
			System.out.println("file not exist");
			e.printStackTrace();
		}
	}

	public Guitar getGuitar(String serialNumber) {

		for (Guitar g : guitarList) {
			if (g.serialNumber == serialNumber) {
				return g;
			} else {
				System.out.println("Sorry, we don't have this guitar available.");
			}
		}

		return null;
	}

	public Piano getPiano(String serialNumber) {
		for (Piano p : pianoList) {
			if (p.serialNumber == serialNumber) {
				return p;
			} else {
				System.out.println("Sorry, we don't have this piano available.");
			}
		}

		return null;
	}

	public Drum getDrum(String serialNumber) {
		for (Drum d : drumList) {
			if (d.serialNumber == serialNumber) {
				return d;
			} else {
				System.out.println("Sorry, we don't have this drum available.");
			}
		}
		return null;
	}

	public ArrayList<Guitar> search(GuitarSpec spec) {
		ArrayList<Guitar> result = new ArrayList<Guitar>();
		for (Guitar g : guitarList) {
			if (g.getSpec().getBackWood().equals(spec.getBackWood()) && g.getSpec().getBuilder().equals(spec.getBuilder())
					&& g.getSpec().getTopeWood().equals(spec.getTopeWood()) && g.getSpec().getModel().equals(spec.getModel())
					&& g.getSpec().getType().equals(spec.getType())) {
				result.add(g);
			}
		}
		return result;
	}

	public ArrayList<Piano> search(PianoSpec spec) {
		ArrayList<Piano> result = new ArrayList<Piano>();
		for (Piano p : pianoList) {
			if (p.getSpec().getBuilder().equals(spec.getBuilder())
					&& p.getSpec().getWood().equals(spec.getWood()) && p.getSpec().getModel().equals(spec.getModel())
					&& p.getSpec().getType().equals(spec.getType())) {
				result.add(p);
			}
		}
		return result;
	}

	public ArrayList<Drum> search(DrumSpec spec) {
		ArrayList<Drum> result = new ArrayList<Drum>();
		for (Drum d : drumList) {
			if (d.getSpec().getDrumHead().equals(spec.getDrumHead()) && d.getSpec().getBuilder().equals(spec.getBuilder())
					&& d.getSpec().getDrumHead().equals(spec.getDrumHead()) && d.getSpec().getWood().equals(spec.getWood())
					&& d.getSpec().getType().equals(spec.getType())) {
				result.add(d);
			}
		}
		return result;
	}
}
