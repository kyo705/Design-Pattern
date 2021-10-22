package Observer;

public class Main {
	
	public static void main(String[] args) {
		Publisher utube = new ConcretePublisher();
		
		Observer subscriber1 = new SubscribedObserver();
		Observer subscriber2 = new SubscribedObserver();
		Observer subscriber3 = new SubscribedObserver();
		
		utube.addObserver(subscriber1);
		utube.addObserver(subscriber2);
		utube.addObserver(subscriber3);
		
		utube.updateContents("재롱이 영상");
	}
	
}
