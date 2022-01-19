package ClassTest;

public class C_04_Car {
	String color;
	int speed;
	int gear;
	@Override
	public String toString() {
		return "C_04_Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
	

}
