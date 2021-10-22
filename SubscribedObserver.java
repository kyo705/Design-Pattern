package Observer;

public class SubscribedObserver implements Observer{

	@Override
	public void update(String str) {
		System.out.println(this.toString()+"´Ô : " + str + "ÄÁÅÙÃ÷°¡ Ãß°¡ µÇ¾ú½À´Ï´Ù.");
		
	}

}
