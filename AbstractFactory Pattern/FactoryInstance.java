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

		return "윈도우에서의 쓰기 기능";
	}
	
}
class WinDelete implements Delete{

	@Override
	public String getDelete() {
		
		return "윈도우에서의 삭제 기능";
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
		return "맥에서의 쓰기 기능";
	}
	
}

class MacDelete implements Delete{

	@Override
	public String getDelete() {
		return "맥에서의 삭제 기능";
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
		return "리눅스에서의 쓰기 기능";
	}
	
}

class LinuxDelete implements Delete{

	@Override
	public String getDelete() {
		return "리눅스에서의 삭제 기능";
	}
	
}
