// 무명 배열 생성 후, 합 출력
package Test;

public class AnonymouseArray {
	public static void main(String[] args) {
		System.out.println("숫자들의 합 : " + sum(new int[] { 1,2,3,4}));
	}
	public static int sum(int[] numbers) {
		int total = 0;
		for(int i = 0; i<numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

}
