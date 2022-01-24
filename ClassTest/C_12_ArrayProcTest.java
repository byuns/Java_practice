package ClassTest;

public class C_12_ArrayProcTest {
	public static int STUDENTS = 5;
	
	public static void main(String args[]) {
		int[] scores = new int[STUDENTS];
		C_12_ArrayProc obj = new C_12_ArrayProc();
		
		obj.getValues(scores);
		System.out.println("∆Ú±’¿∫ = " + obj.getAverage(scores));
		
	}

}
