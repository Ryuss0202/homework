package homework_polymorphism.com.kh.arpg.model.vo;

public class Goblin extends Monster {
	
	public Goblin(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("����� �׸���~ �ϰ� �����մϴ�.");
	}
	
	public void peck() {
		System.out.println("����� ������ ���Ƚ��ϴ�.");
	}
	
	public void hitGoblin() {
		System.out.println("����� ����� ������ hp�� 20��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 20);
		
		if(super.getHp() <= 0 ) {
			System.out.println("����� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
	}

}
