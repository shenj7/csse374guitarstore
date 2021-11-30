
public class PianoSpec {

	Builder builder;
	String model;
	PianoType type;
	Wood wood;
	
	public PianoSpec(Builder builder, String model, PianoType type, Wood wood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.wood = wood;
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
