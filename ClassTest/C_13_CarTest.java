package ClassTest;

public class C_13_CarTest {
	public static void main(String args[]) {
		C_13_Car c1 = new C_13_Car("S600", "white",80);
		C_13_Car c2 = new C_13_Car("E500", "blue", 20);
		int n = C_13_Car.getNumberOfCars(); // 정적 메소드 호출
		System.out.println("지금까지 생성된 자동차 수 = " + n);
	}

}
