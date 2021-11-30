
public class Guitar {
	String serialNumber;
	double price;
	GuitarSpec spec;
	
	public Guitar(String serialNum, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.spec = new GuitarSpec(); // todo: add specs in guitarspec
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
