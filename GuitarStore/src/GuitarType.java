
public enum GuitarType {
	 CLASSICAL, ACOUSTIC, ELECTRIC, BASS;
	
	public String toString() {
		switch(this) {
			case CLASSICAL: return "Classical";
			case ACOUSTIC: return "Acoustic";
			case ELECTRIC: return "Electric";
			case BASS: return "Bass";
			default: return "unspecified";
		}
	}
}
