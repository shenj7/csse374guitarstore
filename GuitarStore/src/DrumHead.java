
public enum DrumHead {
	CLEAR, DRY, BASS, AMBASSADOR;
	
	@Override
	public String toString() {
		switch(this) {
			case CLEAR: return "Clear Drum Head";
			case DRY: return "Dry Drum Head";
			case BASS: return "Bass Drum Head";
			case AMBASSADOR: return "Ambassador Drum Head";
			default: return "unspecified";
		}
	}
	
}
