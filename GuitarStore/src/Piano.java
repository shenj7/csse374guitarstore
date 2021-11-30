
public class Piano {
	String serialNumber;
	double price;
	PianoSpec spec;
	
	public Piano(String serialNum, double price, Builder builder, String model, PianoType type, Wood wood) {
		this.serialNumber = serialNum;
		this.price = price;
		this.spec = new PianoSpec(builder, model, type, wood);
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

	public PianoSpec getSpec() {
		return this.spec;
	}
}
