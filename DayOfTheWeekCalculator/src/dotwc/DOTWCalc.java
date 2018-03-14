package dotwc;


public class DOTWCalc {
	
	public int	month	= Calendar.FEBRUARY;
	public int	day		= 25;
	public int	year	= 2894;
	
	
	public DOTWCalc() {
		if (year < 0) {
			System.out.println("This calculator will not work for years before year 0.");
		} else {
			int centryCode = Calendar.getCentCode(year);
			int lastTwoOfYear = year % 100;
			int div12 = lastTwoOfYear / 12;
			int remainder = lastTwoOfYear % 12;
			int div4 = remainder / 4;
			
			int totalNum = (div12 + centryCode + remainder + div4) % 7;
			int dis = Calendar.distanceToDoomsday(day, Calendar.getDoomsday(month, Calendar.isLeapYear(year)));
			
			int dayOfWeek = Calendar.calculateDay(totalNum, dis);
			
			System.out.println("The day of the week on " + month + "-" + day + "-" + year + " is: " + Calendar.dayToText(dayOfWeek));
		}
	}
	
	
	public static void main(String[] args) {
		new DOTWCalc();
	}
	
}
