package homework_polymorphism.com.kh.arpg.model.vo;

public class Orc extends Monster{
	
	public Orc(int hp, int exp, String kinds) {
		super(hp, exp, kinds);
	}

	@Override
	public void cry() {
		System.out.println("��ũ�� ũ���� �ϰ� �����մϴ�.");
	}
	
	public void punch() {
		System.out.println("��ũ�� �б�� ����Ĩ�ϴ�. ���!!");
	}
	
	public void hitOrc() {
		System.out.println("��ũ�� ����� ������ hp�� 100��ŭ �����մϴ�.");
		super.setHp(super.getHp() - 100);
		
		if(super.getHp() <= 0) {
			System.out.println("��ũ�� �������ϴ�. ����ġ�� " + super.getExp() + "��ŭ ����մϴ�.");
		}
	}
}
