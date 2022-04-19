package timeCalCulation;

public class Test {
	public static String timeCalCulation(int s) {
		int seconds = 0, minutes = 0, hours = 0;
		if(s < 60) {
			seconds = s;
		}
		else if(s >= 60 && s <3600) {
			minutes = s/60;
			seconds = s % 60;
		}
		else {
			hours = s / 360;
			s = s - (hours*60);
			minutes = s / 60;
			s = s - (minutes*60);
			seconds = s % 60;
		}
		String second = seconds + "";
		String minute = minutes + "";
		String hour = hours + "";
		if (second.length() == 1)
			second = "0" + second;
		if(minute.length() == 1)
			minute = "0" + minute;
		if(hour.length() == 1)
			hour = "0" + hour;
		return hour + ":" + minute + ":" + second;
		
	}

public static void main(String[] args) {
	System.out.println(timeCalCulation(3500));
	}
}
