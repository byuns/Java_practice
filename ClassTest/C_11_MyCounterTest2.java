package ClassTest;

public class C_11_MyCounterTest2 {
	public static void main(String args[]) {
		C_11_MyCounter obj = new C_11_MyCounter();
		
		System.out.println("boj.value = " + obj.value);
		obj.inc(obj);
		System.out.println("obj.value = " + obj.value);
	}

}
