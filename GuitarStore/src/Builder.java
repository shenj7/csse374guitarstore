
public enum Builder {
	GIBSON, HARMAN, SHURE, YAMAHA;
	
	@Override
	public String toString() {
		switch(this) {
			case GIBSON: return "Gibson";
			case HARMAN: return "Harman";
			case SHURE: return "Shure";
			case YAMAHA: return "Yamaha";
			default: return "unspecified";
		}
	}
	
}
