package TempleteMethod;

public abstract class Templete {

	public void process(){
		p1();
		p2();
		p3();
	}
	abstract protected void p1();
	abstract protected void p2();
	abstract protected void p3();
}
