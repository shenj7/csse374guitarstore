
public enum GuitarType {
	 CLASSICAL, ACOUSTIC, ELECTRIC, BASS;
	
	public String toString() {
		switch(this) {
			case CLASSICAL: return "Classical Guitar";
			case ACOUSTIC: return "Acuostic Guitar";
			case ELECTRIC: return "Electric Guitar";
			case BASS: return "Bass Guitar";
			default: return "unspecified";
		}
	}
}
