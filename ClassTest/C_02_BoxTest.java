package ClassTest;

public class C_02_BoxTest {
	public static void main(String[] args) {
		C_02_Box b;
		b = new C_02_Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", "+b.height + "입니다.");
	}

}
