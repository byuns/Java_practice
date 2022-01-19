// 리스트 정렬 Arrays.sort("배열 명")

package Test;
import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		
		for(int i = 0; i<numbers.length; i++) {
			int r = (int) (Math.random() * 100);
			numbers[i] = r;
		}
		System.out.println("최초의 리스트 : ");
		for(int r : numbers) {
			System.out.print(r + " ");
		}
		Arrays.sort(numbers); // 오름차순 정렬
		
		System.out.println("\n정렬된 리스트 : ");
		for(int r : numbers) {
			System.out.print(r + " ");
		}
	}
}
