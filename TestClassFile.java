//1. 객체가 생성되지 않은 상태에서 호출되므로 객체 안에서만 존재하는 인스턴스 변수들을 사용 x
//2. 인스턴스 메소드도 객체가 생성되어야만 사용할 수 있다.
//3. 정적 메소드에서 정적 메소드를 호출하는 것은 가능하지만 this 사용 x >> this가 참조할 인스턴스가 없다.
public class TestClassFile {
	public static void main(String args[]) {
		System.out.println(add(10,20));
		System.out.println(add(10,20));
	}
	static int add(int a,int b) {
		return a+b;
	}
}
