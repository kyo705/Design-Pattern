package Mediator;

public class MessageMediator extends Mediator{

	@Override
	public void medate(String data,User user) {
		for (User u : users) {
			u.handle(data,user);
		}
		
	}

}
