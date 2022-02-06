package FactoryMethod;

public abstract class Factory {

	abstract protected void moneydown();
	abstract protected Item createitem();
	abstract protected void dbsave();
	
	public Item process() {
		Item item;
		
		moneydown();
		item = createitem();
		dbsave();
		
		return item;
	}
}
