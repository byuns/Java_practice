package ClassTest;

public class C_15_OuterClass {
	private int value = 10;
	
	class InnerClass{
		public void myMehod() {
			System.out.println("�ܺ� Ŭ������ private ���� �� : " + value); // ���� Ŭ������ ȣ�� �����ϴ�.
		}
	}
	
	C_15_OuterClass(){
		InnerClass obj = new InnerClass();
		obj.myMehod();
	}

}
