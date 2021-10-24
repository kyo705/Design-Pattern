package Mediator;

public class MessageUser extends User{

	@Override
	void handle(String data,User user) {
		
		System.out.println(data+" By "+user +" From "+this);
	}

}
