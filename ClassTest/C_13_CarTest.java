package ClassTest;

public class C_13_CarTest {
	public static void main(String args[]) {
		C_13_Car c1 = new C_13_Car("S600", "white",80);
		C_13_Car c2 = new C_13_Car("E500", "blue", 20);
		int n = C_13_Car.getNumberOfCars(); // ���� �޼ҵ� ȣ��
		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);
	}

}
