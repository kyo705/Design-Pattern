package Builder;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder.start()
				.withCpu("인텔 i7").withRam("16G").withStorage("250G SSD")
				.build();
		
		System.out.println(computer.toString());
	}

}
