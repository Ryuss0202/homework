package homework_polymorphism.com.kh.arpg.controller;

import homework_polymorphism.com.kh.arpg.model.vo.Goblin;
import homework_polymorphism.com.kh.arpg.model.vo.Monster;
import homework_polymorphism.com.kh.arpg.model.vo.Orc;
import homework_polymorphism.com.kh.arpg.model.vo.Player;

public class PlayerManager {
	
	public void startPlay(String name) {
		
		Player p = new Player(name);
		
		System.out.println(p.getName() + "님께서 필드에 입장하셨습니다.");
		
		Monster g1 = new Goblin(200, 200, "미니고블린");
		
		g1.cry();
		
		if(g1 instanceof Goblin) {
			((Goblin) g1).hitGoblin();
		}
		
		for(int i = g1.getHp(); i > 0; i -= 20) {
			if(g1 instanceof Goblin) {
				((Goblin) g1).hitGoblin();
			}
		}
		
		p.setExp(p.getExp() + g1.getExp());
		
		System.out.println(p);
		
		Monster o1 = new Orc(2000, 2000, "난폭한 오크");
		
		o1.cry();
		
		for(int i = o1.getHp(); i > 0; i -= 100) {
			if(o1 instanceof Orc) {
				((Orc) o1).hitOrc();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		p.setExp(p.getExp() + o1.getExp());
		
		System.out.println(p);
	}
}
