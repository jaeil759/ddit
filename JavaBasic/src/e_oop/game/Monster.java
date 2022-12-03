package e_oop.game;

import java.util.Random;

public class Monster extends Status{
	Item[] inventory;
	
	private Monster() {}

	public Monster(String name, int maxHp, int maxMp, int att, int def, int exp,Item[] inventory) {
		this.name = name;
		this.hp = maxHp;
		this.mp = maxMp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.inventory = inventory;
	}
	
	public Item itemDrop() {
		Random rnd = new Random();
		Item item;
		item = this.inventory[rnd.nextInt(this.inventory.length)];
		return item;
	
	}
	public void attack(Character c) {
		//몬스터가 가하는 데미지
		int damage = this.att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp -= damage;
		c.hp = c.hp < 0 ? 0 : c.hp;
		System.out.println(this.name + "(이)가 공격으로" + c.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
	}
}







