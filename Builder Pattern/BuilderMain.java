package Builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start()
				.withCpu("ÀÎÅÚ i7").withRam("16G").withStorage("250G SSD")
				.build();
		
		System.out.println(computer.toString());
	}

}
