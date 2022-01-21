//접근제어 (public, private, protected)

package Test;

class A{
	private int a;
	int b;
	public int c;
}

public class objTest {
	public static void main(String[] args) {
		A obj = new A();
		
//		obj.a = 10; // 접근 안 됨
		obj.b = 20;
		obj.c = 30;
	}

}
