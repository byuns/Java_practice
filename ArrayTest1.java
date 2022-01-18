//1~10 배열 저장 후 출력

package Test;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		int[] s = new int[10];
		for(int i = 0;i<s.length; i++) {
			s[i] = i;
		}
		
		for(int i = 0; i<s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

}
