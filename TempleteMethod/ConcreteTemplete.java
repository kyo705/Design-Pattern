package TempleteMethod;

public class ConcreteTemplete extends Templete{

	@Override
	protected void p1() {
		System.out.println("MySql DB에 연결");
	}

	@Override
	protected void p2() {
		System.out.println("SQL을 통한 조회");
	}

	@Override
	protected void p3() {
		System.out.println("조회된 데이터 객체에 넣음");
	}

}
