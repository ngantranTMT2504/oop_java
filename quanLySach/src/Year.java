
public class Year {
	private int day;
	private int month;
	private int year;
	
	public Year() {
		
	}
	public Year(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day > 0 && day < 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if ( month > 0 && month < 13) {
			this.month = month;
		} else {
			this.month = 1;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (month > 0) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}
	
}
