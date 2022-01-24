package ClassTest;

public class C_14_Employee {
	public String name;
	private double salary;
	
	private static int count = 0;
	
	public C_14_Employee(String n, double s) {
		name = n;
		salary = s;
		count ++;
	}
	
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}

}
