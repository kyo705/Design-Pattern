package AbstractFactory;

import AbstractFactory.abs.AppFactory;
import AbstractFactory.abs.Delete;
import AbstractFactory.abs.Write;
import AbstractFactory.concrete.FactoryInstance;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		AppFactory fac = FactoryInstance.getFac();
		
		Write write = fac.write();
		Delete delete = fac.delete();
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(write.getWrite()+", "+delete.getDelete());
	}

}
