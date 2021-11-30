
public class DrumSpec {

	Builder builder;
	String model;
	DrumType type;
	Wood wood;
	DrumHead drumHead;
	
	public DrumSpec(Builder builder, String model, DrumType type, Wood wood, DrumHead drumHead) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.wood = wood;
		this.drumHead = drumHead;
	}
	
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public DrumType getType() {
		return this.type;
	}
	
	public Wood getWood() {
		return this.wood;
	}
	
	public DrumHead getDrumHead() {
		return this.drumHead;
	}
}
