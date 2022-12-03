package e_oop.tv;

import java.util.Scanner;

public class TV {
	boolean power; //전원 false
	int channel; //채널 0
	int volume;//음량 0
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	public static void main(String[] args) {
		// 1. TV 라는 클래스를 만들어주세요.
		// 2. TV 라는 채널과 볼륨을 변수로 만들어 주세요.
		// 3. 채널 및 볼륨과 관계된 동작들을 메소드로 만들어 주세요(단, 채널 및 볼륨과 관계된 동작들이 실행될때 실행되었다는 안내를 해주세요.)
		/*
		 * 
		 * ---------------------------------------------
		 * 1. 전원 2. 채널변경 3. 채널업 4. 채널다운 
		 * 5. 볼륨업 6. 볼륨다운 7. 현재정보 0.종료
		 * ---------------------------------------------
		 */
		
		TV tv = new TV();
		Scanner sc = new Scanner(System.in);
		remoteController:
		while(true) {
			
			System.out.println("---------------------------------------------    ");
			System.out.println("1. 전원 2. 채널변경 3. 채널업 4. 채널다운");
			System.out.println("5. 볼륨업 6. 볼륨다운 7. 현재정보 0.종료 ");
			System.out.println("---------------------------------------------    ");
			System.out.print("번호입력 >>");
			int input = Integer.parseInt(sc.nextLine());
			switch(input) {
			case 1 : 
				//방법1. 객체의 변수에 직접 접근하여 값을 변경한다.
//			if(tv.power) {
//				System.out.println("TV가 켜졌습니다.");
//			}else {
//				System.out.println("TV가 꺼졌습니다");
//			}
				tv.powerToggle();
				break;
			case 2 : 
				System.out.println("변경하실 채널 번호 >>");
				tv.channelChange(Integer.parseInt(sc.nextLine()));
				break;
			case 3 : 
				tv.channelUp();
				break;
			case 4 : 
				tv.channelDown();
				break;
			case 5 : 
				tv.volume();
				break;
			case 6 : 
				tv.volumeDown();
				break;
			case 7 : 
				System.out.println(tv);
			case 0 : 
				tv.powerOff();
				System.out.println("프로그램을 종료합니다.");
				break remoteController;
			
				
			}
		}
	}
	@Override
	public String toString() {
		return "현재 채널 : " + this.channel + "\n현재음량 : " + this.volume;
	}
	private void volumeDown() {
		this.volume--;
		if(this.volume < this.MIN_VOLUME) {
			this.volume = this.MIN_VOLUME;
		}
		System.out.println("TV 음량 : " + this.volume);
	}

	private void volume() {
		this.volume++;
		if(this.volume > this.MAX_VOLUME) {
			this.volume = this.MAX_VOLUME;
		}
		System.out.println("TV음량 : " + this.volume);
	}

	private void channelDown() {
		if(this.power) {
			this.channel--;
			if(this.channel < this.MIN_CHANNEL) {
				this.channel = this.MAX_CHANNEL;
			}
			System.out.println("채널이" + this.channel + "로 변경되었습니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	private void channelUp() {
		if(this.power) {
			this.channel++;
			if(this.channel < this.MAX_CHANNEL) {
				this.channel = this.MIN_CHANNEL;
			}
			System.out.println("채널이" + this.channel + "로 변경되었습니다.");
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	private void channelChange(int parseInt) {
		this.channel = parseInt;
		System.out.println("채널이" + this.channel + "로 변경되었습니다.");
	}

	private void powerOff() {
		if(this.power) {
			System.out.println("TV 가 꺼졌습니다.");
		}
		this.power = false;
	}

			//tv.power = !tv.power;
			//방법2. 메소드를 이용하여 값에 접근한다.
	public void powerToggle() {
		this.power = !this.power;
		if(this.power) {
			System.out.println("TV가 켜졌습니다");
		}else {
			System.out.println("TV가 꺼졌습니다");
		}
	}
	
	
}
