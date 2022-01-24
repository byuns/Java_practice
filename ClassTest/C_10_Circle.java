package ClassTest;

public class C_10_Circle {
	private int radius;
	private C_10_Point center;
	
	public C_10_Circle(C_10_Point p, int r) {
		center = p;
		radius = r;
	}

	@Override
	public String toString() {
		return "C_10_Circle [radius=" + radius + ", center=" + center + "]";
	}
	

}
