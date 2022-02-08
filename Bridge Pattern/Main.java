package Bridge;

public class Main {

	public static void main(String[] args) {
		ConcreteMos cmos = new ConcreteMos(new ConsoleMosFunc());
		
		cmos.K().Y().O();
	}
}
