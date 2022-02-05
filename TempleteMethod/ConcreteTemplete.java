package TempleteMethod;

public class ConcreteTemplete extends Templete{

	@Override
	void p1() {
		System.out.println("MySql DB에 연결");
	}

	@Override
	void p2() {
		System.out.println("SQL을 통한 조회");
	}

	@Override
	void p3() {
		System.out.println("조회된 데이터 객체에 넣음");
	}

}
