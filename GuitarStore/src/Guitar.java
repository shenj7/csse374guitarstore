
public class Guitar {
	String serialNumber;
	double price;
	GuitarSpec spec;
	
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
