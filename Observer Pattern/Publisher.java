package Observer;

public interface Publisher {

	public void addObserver(Observer obs);
	public void deleteObserver(Observer obs);
	public void notifyObserver();
	public void updateContents(String str);
}
