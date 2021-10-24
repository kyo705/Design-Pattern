package Mediator;

public abstract class User {

	protected Mediator mediator;
	
	public boolean join(Mediator mediator) {
		this.mediator = mediator;
		return mediator.addUser(this);
	}
	
	public boolean unjoin(Mediator mediator) {
		if(mediator.users.contains(this)) {
			return mediator.users.remove(this);
		}else
			return false;
	}
	
	public void sendData(String data) {
		mediator.medate(data,this);
	}
	
	abstract void handle(String data,User user);
}
