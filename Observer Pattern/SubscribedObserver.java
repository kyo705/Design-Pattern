package Observer;

public class SubscribedObserver implements Observer{

	@Override
	public void update(String str) {
		System.out.println(this.toString()+"님 : " + str + "컨텐츠가 추가 되었습니다.");
		
	}

}
