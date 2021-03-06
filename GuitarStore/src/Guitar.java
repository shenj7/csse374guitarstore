
public class Guitar {
	String serialNumber;
	double price;
	GuitarSpec spec;
	
	public Guitar(String serialNum, double price, Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
		this.serialNumber = serialNum;
		this.price = price;
		this.spec = new GuitarSpec(builder, model, type, backWood, topWood);
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

	public GuitarSpec getSpec() {
		return this.spec;
	}
}
