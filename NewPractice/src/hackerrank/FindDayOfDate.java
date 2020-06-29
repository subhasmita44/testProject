package hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class FindDayOfDate {

	public static void main(String[] args) {
		try {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		String mm=bufferedReader.readLine();
		String dd=bufferedReader.readLine();
		String yy=bufferedReader.readLine();
		LocalDate local=LocalDate.of(Integer.parseInt(yy),Integer.parseInt(mm),Integer.parseInt(dd));
		
		DayOfWeek getWeek1=local.getDayOfWeek();
		System.out.println(getWeek1);
			/*
			 * Calendar cal=Calendar.getInstance(); cal.set(Integer.parseInt(yy),
			 * Integer.parseInt(mm)-1, Integer.parseInt(dd)); String
			 * day_of_week=getDayofWeek(cal.get(Calendar.DAY_OF_WEEK));
			 * 
			 * System.out.println(day_of_week);
			 */
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	static String getDayofWeek(int day) {
		String dayofweek="";
		switch(day) {
			case 1:dayofweek="MONDAY";
			break;
			case 2:dayofweek="TUESDAY";
			break;
			case 3:dayofweek="WEDNESDAY";
			break;
			case 4:dayofweek="THURSDAY";
			break;
			case 5:dayofweek="FRIDAY";
			break;
			case 6:dayofweek="SATURDAY";
			break;
			case 7:dayofweek="SUNDAY";
			break;
			 
		}
		return dayofweek;
	}

}

	

