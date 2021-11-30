
public class GuitarSpec extends Spec{

	GuitarType type;
	Wood backWood;
	Wood topWood;
	
	public GuitarSpec(Builder builder, String model, GuitarType type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public GuitarType getType() {
		return this.type;
	}
	
	public Wood getBackWood() {
		return this.backWood;
	}
	
	public Wood getTopeWood() {
		return this.topWood;
	}
	
}
