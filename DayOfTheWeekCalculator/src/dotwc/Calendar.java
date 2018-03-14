package dotwc;


public class Calendar {
	
	public static int	JANUARY		= 1;
	public static int	FEBRUARY	= 2;
	public static int	MARCH		= 3;
	public static int	APRIL		= 4;
	public static int	MAY			= 5;
	public static int	JUNE		= 6;
	public static int	JULY		= 7;
	public static int	AUGUST		= 8;
	public static int	SEPTEMBER	= 9;
	public static int	OCTOBER		= 10;
	public static int	NOVEMBER	= 11;
	public static int	DECEMBER	= 12;
	
	
	public static int	SUNDAY		= 0;
	public static int	MONDAY		= 1;
	public static int	TUESDAY		= 2;
	public static int	WEDNESDAY	= 3;
	public static int	THURSDAY	= 4;
	public static int	FRIDAY		= 5;
	public static int	SATURDAY	= 6;
	
	
	public static int getCentCode(int year) {
		int sub = year / 100;
		int tester = 0;
		boolean breaker = false;
		while (!breaker) {
			if (tester == sub) {
				return TUESDAY;
			}
			tester++;
			if (tester == sub) {
				return SUNDAY;
			}
			tester++;
			if (tester == sub) {
				return FRIDAY;
			}
			tester++;
			if (tester == sub) {
				return WEDNESDAY;
			}
			tester++;
		}
		
		return 0;
	}
	
	
	public static boolean isLeapYear(int year) {
		return ((year % 4) == 0);
	}
	
	
	public static int getDoomsday(int month, boolean leapYear) {
		if (month == JANUARY) {
			if (leapYear) {
				return 4;
			} else {
				return 3;
			}
		}
		if (month == FEBRUARY) {
			if (leapYear) {
				return 29;
			} else {
				return 28;
			}
		}
		if (month == MARCH) {
			return 14;
		}
		if (month == APRIL) {
			return 4;
		}
		if (month == MAY) {
			return 9;
		}
		if (month == JUNE) {
			return 6;
		}
		if (month == JULY) {
			return 11;
		}
		if (month == AUGUST) {
			return 8;
		}
		if (month == SEPTEMBER) {
			return 5;
		}
		if (month == OCTOBER) {
			return 10;
		}
		if (month == NOVEMBER) {
			return 7;
		}
		if (month == DECEMBER) {
			return 12;
		}
		
		return 0;
	}
	
	
	public static int distanceToDoomsday(int day, int doomsday) {
		return day - doomsday;
	}
	
	
	public static String dayToText(int day) {
		if (day == SUNDAY) {
			return "Sunday";
		}
		if (day == MONDAY) {
			return "Monday";
		}
		if (day == TUESDAY) {
			return "Tuesday";
		}
		if (day == WEDNESDAY) {
			return "Wednesday";
		}
		if (day == THURSDAY) {
			return "Thursday";
		}
		if (day == FRIDAY) {
			return "Friday";
		}
		if (day == SATURDAY) {
			return "Saturday";
		}
		return "UNKNOWN";
	}
	
	
	public static int calculateDay(int num, int disToDoomsday) {
		if (disToDoomsday >= 0) {
			while (disToDoomsday > 0) {
				num++;
				disToDoomsday--;
				if (num > SATURDAY) {
					num = SUNDAY;
				}
			}
			return num;
		} else {
			while (disToDoomsday < 0) {
				num--;
				disToDoomsday++;
				if (num < SUNDAY) {
					num = SATURDAY;
				}
			}
			return num;
		}
	}
	
}
