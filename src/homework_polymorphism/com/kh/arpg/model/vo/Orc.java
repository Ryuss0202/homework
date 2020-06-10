package homework_polymorphism.com.kh.arpg.model.vo;

public class Orc extends Monster{
	
	public Orc(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("오크가 크으아 하고 위협합니다.");
	}
	
	public void punch() {
		System.out.println("오크가 둔기로 내려칩니다. 쿠웅!!");
	}
	
	public void hitOrc() {
		System.out.println("오크가 비명을 지르며 hp가 100만큼 감소합니다.");
		super.setHp(super.getHp() - 100);
		
		if(super.getHp() <= 0) {
			System.out.println("오크가 쓰러집니다. 경험치가 " + super.getExp() + "만큼 상승합니다.");
		}
	}
}
