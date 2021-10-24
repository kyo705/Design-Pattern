package Mediator;

public class Main {

	public static void main(String[] args) {
		
		Mediator mediator = new MessageMediator();
		
		User user1 = new MessageUser();
		User user2 = new MessageUser();
		User user3 = new MessageUser();
		
		user1.join(mediator);
		user2.join(mediator);
		user3.join(mediator);
		
		user1.sendData("오늘 머해");
	}

}
