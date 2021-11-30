
public enum Wood {
	ALDER, BASSWOOD, WALNUT, KOA;
	@Override
	public String toString() {
		switch(this) {
			case ALDER: return "Alder";
			case BASSWOOD: return "Basswood";
			case WALNUT: return "Walnut";
			case KOA: return "Koa";
			default: return "unspecified";
		}
	}
}
