
public enum PianoType {
	CONSOLE, STUDIO, UPRIGHT, DIGITAL;
	
	@Override
	public String toString() {
		switch(this) {
			case CONSOLE: return "Counsole Piano";
			case STUDIO: return "Studio Piano";
			case UPRIGHT: return "Upright Piano";
			case DIGITAL: return "Digital Piano";
			default: return "unspecified";
		}
	}
	
}
