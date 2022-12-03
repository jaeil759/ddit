package e_oop.game;

public class Item extends Status{
	
	private Item() {}

	public Item(String name, int maxHp, int maxMp, int att, int def) {
		super();
		this.name = name;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
		this.att = att;
		this.def = def;
	}
	public String toString() {
		String info = name + " : " ;
		if(maxHp > 0) {
			info += "체력+" + maxHp; 
		}
		info += maxMp > 0 ? "마나+" + maxMp : "";
		info += att > 0 ? "공격+" + att : "";
		info += def > 0 ? "방어+" + def : "";
		return info;
	}
}
