package ClassTest;

public class C_15_OuterClass {
	private int value = 10;
	
	class InnerClass{
		public void myMehod() {
			System.out.println("외부 클래스의 private 변수 값 : " + value); // 내부 클래스를 호출 가능하다.
		}
	}
	
	C_15_OuterClass(){
		InnerClass obj = new InnerClass();
		obj.myMehod();
	}

}
