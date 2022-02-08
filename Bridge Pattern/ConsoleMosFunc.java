package Bridge;

public class ConsoleMosFunc implements MosFunc {

	@Override
	public void dot() {
		System.out.print(".");
	}

	@Override
	public void dash() {
		System.out.print("-");
	}

	@Override
	public void space() {
		System.out.print(" ");
	}

}
