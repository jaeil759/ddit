package e_oop.game;

import java.util.Random;
import java.util.Scanner;

public class Main {
	Character c; 
	Item[] itemPool;
	Monster[] monsterPool;
	Scanner sc = new Scanner(System.in);

	Main(){
		c = new Character("재키찬", 100, 50, 20, 10);
		itemPool = new Item[12];
		itemPool[0] = new Item("나무검", 0,0,10,0);
		itemPool[1] = new Item("천갑옷", 0,0,0,10);
		itemPool[2] = new Item("체력구슬", 10,0,0,0);
		itemPool[3] = new Item("마나구슬", 0,10,0,0);
		
		itemPool[4] = new Item("강철검", 0,0,30,0);
		itemPool[5] = new Item("가죽갑옷", 0,0,0,30);
		itemPool[6] = new Item("체력주머니", 50,0,0,0);
		itemPool[7] = new Item("마나주머니", 0,50,0,0);
		
		itemPool[8] = new Item("무한의대검", 0,0,100,0);
		itemPool[9] = new Item("가시갑옷", 0,0,0,100);
		itemPool[10] = new Item("체력의 샘", 200,0,0,0);
		itemPool[11] = new Item("마나의 샘", 0,200,0,0);
		
		monsterPool = new Monster[3];
	//	Item[] items = new Item[] {itemPool[0],itemPool[1],itemPool[2],itemPool[3]};
		Item[] items = {itemPool[0],itemPool[1],itemPool[2],itemPool[3]};
		monsterPool[0] = new Monster("바위게", 20, 20, 10, 10, 50, items);
		monsterPool[1] = new Monster("협곡의 전령", 100, 20, 50, 50, 100, new Item[] {itemPool[4],itemPool[5],itemPool[6],itemPool[7]});
		monsterPool[2] = new Monster("바론", 5000, 2000, 200, 200, 400, new Item[] {itemPool[8],itemPool[9],itemPool[10],itemPool[11]});
		
	}
	public static void main(String[] args) {
		new Main().start();
	}
	public void start(){
		int input = 0;
		System.out.println("=======================게임시작=======================");
		game:
			while(true) {
				if(c.hp <= 0) {
					System.out.println("플레이어의 체력이 없습니다.");
					System.out.println("게임이 종료됩니다.");
					break game;
				}
				System.out.println("----------메인메뉴----------");
				System.out.println("1.내정보         2.사냥         0.종료");
				System.out.println("----------------------------");
				System.out.println("메뉴를 입력해 주세요 >> ");
				input = Integer.parseInt(sc.nextLine());
				switch(input) {
				case 1:
					clearScreen();
					c.showInfo();
					break;
				case 2:
					clearScreen();
					hunt();
					break;
				case 0:
					System.out.println("게임을 종료합니다.");
					break game;
				}
			}
	}
//	public void start() {
//		c.showInfo();
//	}
	public void hunt() {
		Monster targetMonster = monsterPool[new Random().nextInt(monsterPool.length)];
		Monster m = new Monster(targetMonster.name,targetMonster.maxHp,targetMonster.maxMp,targetMonster.att, targetMonster.def, targetMonster.exp, targetMonster.inventory);
		System.out.println("----------전투 화면----------");
		System.out.println(m.name + "을(를) 만났습니다. 전투를 시작합니다.");
		
		int input = 0;
		battle:
			while(true) {
				System.out.print("1.공격  2.도망 >>");
				input = Integer.parseInt(sc.nextLine());
				switch(input) {
				case 1:
					c.attack(m);
					if(m.hp <=0) {
						System.out.println(m.name + "을(를) 처치하였습니다.");
						System.out.println("----------전투 종료----------");
						c.getItem(m.itemDrop());
						c.getExp(m.exp);
						System.out.println();
						break battle;
					}
					m.attack(c);
					if(c.hp <=0) {
						System.out.println(c.name + "이(가) 죽었씁니다.");
						System.out.println("----------전투 종료----------");
						System.out.println();
						break battle;
					}
					break;
				case 2:
					System.out.println(m.name + "(으)로부터 도망쳤습니다");
					break battle;
				}
			}
	}
	public static void clearScreen() {
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}
