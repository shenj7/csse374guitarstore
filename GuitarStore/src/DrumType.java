
public enum DrumType {
	SNARE, TENOR, ELECTRONIC, TIMPANI;
	
	@Override
	public String toString() {
		switch(this) {
			case SNARE: return "Snare";
			case TENOR: return "Tenor";
			case ELECTRONIC: return "Electronic";
			case TIMPANI: return "Timpani";
			default: return "unspecified";
		}
	}
	
}
