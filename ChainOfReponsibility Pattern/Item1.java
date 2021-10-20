package ChainOfResposibility;

public class Item1 implements ItemChain{

	private int defence;
	private ItemChain nextitemchain;
	
	public Item1(int defence) {
		super();
		this.defence = defence;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	@Override
	public void nextItemChain(ItemChain nextitemchain) {
		this.nextitemchain = nextitemchain;
		
	}

	@Override
	public Attack amonutdamage(Attack attack) {
		if(attack.getDamage()<=defence) {
			attack.setDamage(0);
			return attack;
		}else {
			attack.setDamage(attack.getDamage()-defence);
			if(this.nextitemchain!=null) {
				return this.nextitemchain.amonutdamage(attack);
			}else {
				return attack;
			}
			
		}
	}

}
