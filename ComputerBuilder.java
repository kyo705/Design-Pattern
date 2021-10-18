package Builder;

//Computer ��ü�� ��������� ���� �� main�Լ����� ��ü ������ �������� ���̱� ���� ���
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
