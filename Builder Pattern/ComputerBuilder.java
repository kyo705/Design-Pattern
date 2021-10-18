package Builder;

//Computer 객체의 멤버변수가 많을 때 main함수에서 객체 생성의 가독성을 높이기 위한 방법
public class ComputerBuilder {

	private Computer computer;
	
	private ComputerBuilder() {
		this.computer = new Computer("default", "default", "default");
	}
	
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	public ComputerBuilder withCpu(String cpu) {
		computer.setCpu(cpu);
		return this;
	}
	
	public ComputerBuilder withRam(String ram) {
		computer.setRam(ram);
		return this;
	}
	
	public ComputerBuilder withStorage(String storage) {
		computer.setStorage(storage);
		return this;
	}
	
	public Computer build() {
		return computer;
	}
}
