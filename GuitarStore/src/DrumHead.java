
public enum DrumHead {
	CLEAR, DRY, BASS, AMBASSADOR;
	
	@Override
	public String toString() {
		switch(this) {
			case CLEAR: return "Clear";
			case DRY: return "Dry";
			case BASS: return "Bass";
			case AMBASSADOR: return "Ambassador";
			default: return "unspecified";
		}
	}
	
}
