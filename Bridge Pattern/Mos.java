package Bridge;

public class Mos {

	MosFunc mosfunc;
	
	public Mos(MosFunc mosfunc) {
		this.mosfunc = mosfunc;
	}
	
	public void setMosfunc(MosFunc mosfunc) {
		this.mosfunc = mosfunc;
	}
	
	public void dot() {
		mosfunc.dot();
	}
	
	public void dash() {
		mosfunc.dash();
	}
	
	public void space() {
		mosfunc.space();
	}
}
