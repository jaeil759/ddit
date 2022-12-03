package e_oop.game;

public class Character extends Status{
	 Item[] inventory;
	
	private Character() {}
	// alt shift s -> generate constructure using fields

	public Character(String name, int maxHp, int maxMp, int att, int def) {
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.hp = maxHp;
		this.mp = maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.nextExp = this.level*100;
		this.inventory = new Item[100];
	}
	public void showInfo() {
		System.out.println("---------------상태---------------");
		System.out.println("이름 : " + this.name);
		System.out.println("레벨 : " + this.level);
		System.out.println("체력 : " + this.hp + "/" + this.maxHp);
		System.out.println("마나 : " + this.mp + "/" + this.maxMp);
		System.out.println("공격 : " + this.att);
		System.out.println("방어 : " + this.def);
		System.out.println("경치 : " + this.exp + "/" + this.nextExp);
		System.out.println("-----------------------------");
		System.out.println("--------------아이템---------------");
		for(int i = 0; i < this.inventory.length; i++) {
			if(inventory[i] !=null) {
				// print 메서드에 객체만 들어가면 toString 메서드가 실행됨.
				System.out.println(this.inventory[i]);
			}
		}
		System.out.println("----------------------------------");
		System.out.println();
	}
	public void attack(Monster m) {
		int damage = this.att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage;
		m.hp = m.hp < 0 ? 0 : m.hp;
		System.out.println(this.name + "(이)가 공격으로" + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	public void getItem(Item itemDrop) {
		System.out.println(itemDrop.name + "을(를) 획득하였습니다.");
		for(int i = 0; i < this.inventory.length; i++) {
			if(this.inventory[i] == null) {
				this.inventory[i] = itemDrop;
				break;
			}
		}
		this.maxHp += itemDrop.maxHp;
		this.maxMp += itemDrop.maxMp;
		this.att += itemDrop.att;
		this.def += itemDrop.def;
	}
	public void getExp(int exp) {
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(this.exp >= this.nextExp ) {
			this.exp -= nextExp;
			levelUp();
		}
	}
	public void levelUp() {
		this.level++;
		this.maxHp += 10;
		this.maxMp += 5;
		this.att += 2;
		this.def += 2;
		this.hp += this.maxHp;
		this.mp += this.maxMp;
		this.nextExp = this.level * 100;
		System.out.println("LEVEL UP !!");
	}
}
