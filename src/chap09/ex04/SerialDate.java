package chap09.ex04;

import java.sql.Date;

public class SerialDate {
	private volatile static SerialDate serialDate;
	private Date date;
	
	private SerialDate() {}
	private SerialDate(int day, int month, int year)  {
		date = new Date(year, month, day);
	}

	public static SerialDate createInstance(int day, int month, int year) {
		
		if(serialDate == null) {
			synchronized (SerialDate.class) {
				if(serialDate == null) {
					serialDate = new SerialDate(day, month, year);
				}
			}
		}
		
		return serialDate;
	}
	public static SerialDate addMonths(int i, SerialDate d1) {
		return null;
	}
	public Integer getDayOfMonth() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getMonth() {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getYYYY() {
		// TODO Auto-generated method stub
		return null;
	}
}
