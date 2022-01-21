package ClassTest;

public class C_09_Date {

	private int year;
	private String month;
	private int day;
	
	public C_09_Date(int y, String m, int d) {
		
		this.year = y;
		this.month = m;
		this.day = d;
		
	}
	
	public C_09_Date(int y) {
		
		this(y,"1¿ù",1);
		
	}
	
	public C_09_Date() {
		this(1990,"1¿ù",1);
		
	}

	@Override
	public String toString() {
		return "C_09_Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	

}
