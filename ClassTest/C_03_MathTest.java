package ClassTest;

public class C_03_MathTest {
	public static void main(String[] args) {
		int sum;
		C_03_Math obj = new C_03_Math();
		
		sum = obj.add(2, 3);
		System.out.println("2�� 3�� ���� "+sum);
		sum = obj.add(7, 8);
		System.out.println("7�� 8�� ���� "+sum);
	}

}
