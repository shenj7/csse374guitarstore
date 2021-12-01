
public enum PianoType {
	CONSOLE, STUDIO, UPRIGHT, DIGITAL;
	
	@Override
	public String toString() {
		switch(this) {
			case CONSOLE: return "Console";
			case STUDIO: return "Studio";
			case UPRIGHT: return "Upright";
			case DIGITAL: return "Digital";
			default: return "unspecified";
		}
	}
	
}
