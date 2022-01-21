package ClassTest;

public class C_07_SafeArrayTest {
	public static void main(String[] args) {
		C_07_SafeArray array = new C_07_SafeArray(3);
		
		for(int i = 0; i<(array.length+1); i++) {
			array.put(i,i+10);
		}
		
	}

}
