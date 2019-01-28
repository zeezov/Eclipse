package beans;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	
	
	
	public MyDate(int month, int day, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
