package chapter06.class_part1;

class Time2{
	private boolean am;
	private int hour;
	private int minute;
	private int second;
	
	Time2 (int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int gethour() {return hour;}
	public void setHour(int hour) {
		if (0 <= hour && hour <= 23) {
			this.am = hour <12;
			this.hour = hour % 12;
			if (this.hour == 0)
				this.hour =12;
		}
	}
	
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if (0 <= minute && minute <=59) {
			this.minute = minute;
		}
	}
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(0 <= second && second <=59)
			this.second = second;
	}

void whatTime2() {
	System.out.print(am ? "오전" : "오후");
	System.out.println(hour + "시" + minute + "분" + second + "초");
}

}

public class C050_accesor2 {

	public static void main(String[] args) {
		Time2 now = new Time2(12,34,56);
		now.setHour(13);
		now.whatTime2();
//		now.hour = 13; //err
		now.setHour(34); //조건문 통과x 출력 x
		now.setSecond(-25); //거부
		now.setHour(10);
		now.setMinute(45);
		System.out.println(now.gethour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		
		
	}
}