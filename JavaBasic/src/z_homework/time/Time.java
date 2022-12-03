package z_homework.time;

public class Time {
	private int hour; // 시를 나타내며 0부터 23까지의 값을 갖는다.
	private int minute; // 분를 나타내며 0부터 59까지의 값을 갖는다.
	private int second; // 초를 나타내며 0부터 59까지의 값을 갖는다.
	
	Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	Time(int hour, int minute, int second){
		this.hour = (hour < 0 || hour >23) ? 0 : hour;
		this.minute = (minute < 0 || minute >59) ? 0 : minute;
		this.second = (second < 0 || second >59) ? 0 : second;
//		if(this.second < 0 || this.second > 59) {
//			this.second = 0;
//		}
	}
	public String toString() {
		return String.format("%02d:%02d:%02d",hour, minute, second);
	}
}
