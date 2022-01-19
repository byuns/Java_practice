package ClassTest;

public class C_04_CarTest {
	public static void main(String[] args) {
		C_04_Car myCar = new C_04_Car();
		myCar.changeGear(1);;
		myCar.speedUp();
		myCar.color = "red";
		System.out.println(myCar);
	}

}
