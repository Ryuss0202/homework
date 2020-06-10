package homework_polymorphism.com.kh.arpg.model.vo;

public abstract class Monster {
	private int hp;
	private int exp;
	private String kinds;
	
	public Monster() {}

	public Monster(int hp, int exp, String kinds) {
		super();
		this.hp = hp;
		this.exp = exp;
		this.kinds = kinds;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	public abstract void cry();
}
