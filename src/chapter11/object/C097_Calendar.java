package chapter11.object;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class C097_Calendar {

	public static void main(String[] args) {
/*
 		날짜/시간 관련 클래스
 		  - GregorianCalendar
 		  - SimpleDateFormat
 		  - LocalDate, LocalTime, LocalDateTime
 */
		System.out.println("=== GregorianCalendar 사용 ===");
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초 \n"
				, today.get(Calendar.YEAR)
				, today.get(Calendar.MONTH) + 1 //month는 0부터 값을 가져온다.
				, today.get(Calendar.DATE)
				, today.get(Calendar.AM_PM)
				 == Calendar.AM ? "오전" : "오후"
				, today.get(Calendar.HOUR)
				, today.get(Calendar.MINUTE)
				, today.get(Calendar.SECOND)
		);
		
/*
		 날짜 관련 포맷 문자
		 	패턴					의미
		 	y / yy / yyyy		연도
		 	M / MM				월(숫자)
		 	MMM					월(짧은 이름)
		 	MMMM				월(전체 이름)
		 	d / dd				일(날짜)
		 	E / EEE				요일(짧은 이름)
		 	EEEE				요일(전체 이름)
		 	
		 시간 관련 포맷 문자
		 	패턴					의미
		 	a					오전/오후
		 	h / hh				시(12시간제)
		 	H / HH				시(24시간제)
		 	m / mm				분
		 	s / ss				초
		 	S / SSS				밀리초
*/
		// 날짜를 원하는 형태로 포맷
		System.out.println("=== SimpleDateFormat ===");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
		String formattedDate = sdf.format(today.getTime());
		System.out.println(formattedDate);
		
		
		System.out.println("=== LocalDate, LocalTime ===");
		LocalDate todayDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초 \n"
				, todayDate.getYear()
				, todayDate.getMonthValue()
				, todayDate.getDayOfMonth()
				, nowTime.getHour()
				, nowTime.getMinute()
				, nowTime.getSecond()
		);
		
		System.out.println("=== LocalDateTime, DateTimeFormatter ===");
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a HH:mm:ss");
		String formattedCurrent = currentDateTime.format(formatter);
		System.out.println(formattedCurrent);
				
		
		
		
		
	}

}
