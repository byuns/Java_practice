package ClassTest;

public class C_13_Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0; // ���� ��� ����
	
	public C_13_Car(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	//���� �޼ҵ� ����
	public static int getNumberOfCars() {
		return numbers;
	}

}
