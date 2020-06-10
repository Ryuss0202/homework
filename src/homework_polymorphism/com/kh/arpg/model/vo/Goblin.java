package homework_polymorphism.com.kh.arpg.model.vo;

public class Goblin extends Monster {
	
	public Goblin(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("고블린이 그르르~ 하고 위협합니다.");
	}
	
	public void peck() {
		System.out.println("고블린이 막대기로 때렸습니다.");
	}
	
	public void hitGoblin() {
		System.out.println("고블린이 비명을 지르며 hp가 20만큼 감소합니다.");
		super.setHp(super.getHp() - 20);
		
		if(super.getHp() <= 0 ) {
			System.out.println("고블린이 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
	}

}
