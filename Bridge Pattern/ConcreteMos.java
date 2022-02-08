package Bridge;

public class ConcreteMos extends Mos {

	public ConcreteMos(MosFunc mosfunc) {
		super(mosfunc);
	}
	
	public ConcreteMos K() {
		dash();dot();dash();space();
		return this;
	}
	public ConcreteMos Y() {
		dash();dot();dash();dash();space();
		return this;
	}
	public ConcreteMos O() {
		dash();dash();dash();space();
		return this;
	}
}
