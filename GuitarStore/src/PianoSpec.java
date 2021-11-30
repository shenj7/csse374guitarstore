
public class PianoSpec {

	Builder builder;
	String model;
	PianoType type;
	Wood backWood;
	Wood topWood;
	
	public PianoSpec(Builder builder, String model, PianoType type) {
		this.builder = builder;
		this.model = model;
		this.type = type;
	}
	
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public PianoType getType() {
		return this.type;
	}
	
}
