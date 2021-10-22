package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcretePublisher implements Publisher {

	List<Observer> observers = new ArrayList<>();
	private String str;
	
	@Override
	public void addObserver(Observer obs) {
		if(obs==null) {
			throw new NullPointerException();
		}
		if(!observers.contains(obs))
			observers.add(obs);
	}

	@Override
	public void deleteObserver(Observer obs) {
		if(observers.contains(obs)) {
			observers.remove(obs);
		}
		
	}
	
	@Override
	public void notifyObserver() {
		for(Iterator<Observer> it = observers.iterator();it.hasNext();) {
			Observer ob = it.next();
			ob.update(str);
		}
	}

	@Override
	public void updateContents(String str) {
		
		this.str = str;
		notifyObserver();
	}

}
