package Mediator;

import java.util.*;

public abstract class Mediator {

	protected List<User> users;
	
	public Mediator() {
		users = new ArrayList<User>();
	}

	public boolean addUser(User user) {
		return users.add(user);
	}
	
	abstract public void medate(String data,User user);
	
}
