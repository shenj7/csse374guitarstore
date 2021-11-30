
public enum DrumType {
	SNARE, TENOR, ELECTRONIC, TIMPANI;
	
	@Override
	public String toString() {
		switch(this) {
			case SNARE: return "Snare Drum";
			case TENOR: return "Tenor Drum";
			case ELECTRONIC: return "Electronic Drum";
			case TIMPANI: return "Timpani Drum";
			default: return "unspecified";
		}
	}
	
}
