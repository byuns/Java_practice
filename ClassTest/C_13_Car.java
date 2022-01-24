package ClassTest;

public class C_13_Car {
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers = 0; // 정적 멤버 변수
	
	public C_13_Car(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	//정적 메소드 생성
	public static int getNumberOfCars() {
		return numbers;
	}

}
