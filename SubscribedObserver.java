package Observer;

public class SubscribedObserver implements Observer{

	@Override
	public void update(String str) {
		System.out.println(this.toString()+"�� : " + str + "�������� �߰� �Ǿ����ϴ�.");
		
	}

}
