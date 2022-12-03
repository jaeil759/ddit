package g_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);

		//date 객체를 보기편한 문자열로 변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss.SSS");
		System.out.println(sdf2.format(today));
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 일반적으로 사용하는 포맷
		System.out.println(sdf3.format(today));
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd(w) hh:mm:ss a");
		System.out.println(sdf4.format(today));
		
		// Oracle : 2005/01/08
		// Mysql : 2005-01-08
		
		// 문자열 -> 날짜 객체로 변환
		String str = "2000년 08월 01일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			System.out.println(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴
		
		cal.setTime(today);
		System.out.println(cal.getTime());
		cal.set(2020,6,19);
		System.out.println(cal.getTime());
		
		//날짜계산
		cal.add(Calendar.YEAR,1); //년
		System.out.println(cal.getTime());
		System.out.println(sdf3.format(cal.getTime()));
		cal.add(Calendar.MONTH,2); //월
		cal.add(Calendar.DAY_OF_MONTH, -20); //일
		cal.add(Calendar.HOUR, 4); //시
		cal.add(Calendar.MINUTE,40); //분
		cal.add(Calendar.SECOND,400); //초
	}

}
