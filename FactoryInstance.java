package AbstractFactory.concrete;

import AbstractFactory.abs.AppFactory;
import AbstractFactory.abs.Delete;
import AbstractFactory.abs.Write;

public class FactoryInstance {

	public static AppFactory getFac() {
		if(System.getProperty("os.name").contains("Win")) {
			return new WindowAppFac();
		}else if(System.getProperty("os.name").contains("Mac")) {
			return new MacAppFac();
		}else if(System.getProperty("os.name").contains("Linux")) {
			return new LinuxAppFac();
		}else
			return null;
	}

}

class WindowAppFac implements AppFactory{

	@Override
	public Write write() {
		return new WinWirte();
	}

	@Override
	public Delete delete() {
		return new WinDelete();
	}
	
}

class WinWirte implements Write{

	@Override
	public String getWrite() {

		return "�����쿡���� ���� ���";
	}
	
}
class WinDelete implements Delete{

	@Override
	public String getDelete() {
		
		return "�����쿡���� ���� ���";
	}
	
}

class MacAppFac implements AppFactory{

	@Override
	public Write write() {
		return new MacWrite();
	}

	@Override
	public Delete delete() {
		return new MacDelete();
	}
	
}

class MacWrite implements Write{

	@Override
	public String getWrite() {
		return "�ƿ����� ���� ���";
	}
	
}

class MacDelete implements Delete{

	@Override
	public String getDelete() {
		return "�ƿ����� ���� ���";
	}
	
}

class LinuxAppFac implements AppFactory{

	@Override
	public Write write() {
		return new LinuxWrite();
	}

	@Override
	public Delete delete() {
		return new LinuxDelete();
	}
	
}

class LinuxWrite implements Write{

	@Override
	public String getWrite() {
		return "������������ ���� ���";
	}
	
}

class LinuxDelete implements Delete{

	@Override
	public String getDelete() {
		return "������������ ���� ���";
	}
	
}
