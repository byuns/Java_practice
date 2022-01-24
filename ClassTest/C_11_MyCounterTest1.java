package ClassTest;

public class C_11_MyCounterTest1 {
	public static void main(String args[]) {
		C_11_MyCounter obj = new C_11_MyCounter();
		int x = 10;
		
		obj.inc(obj); 
		System.out.println("x = "+x);
	}

}
  