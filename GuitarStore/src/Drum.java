
public class Drum {
	String serialNumber;
	double price;
	DrumSpec spec;
	
	public Drum(String serialNum, double price, Builder builder, String model, DrumType type, Wood wood, DrumHead drumHead) {
		this.serialNumber = serialNum;
		this.price = price;
		this.spec = new DrumSpec(builder, model, type, wood, drumHead);
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public DrumSpec getSpec() {
		return this.spec;
	}
}
