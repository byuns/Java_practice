// ����Ʈ ���� Arrays.sort("�迭 ��")

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
		System.out.println("������ ����Ʈ : ");
		for(int r : numbers) {
			System.out.print(r + " ");
		}
		Arrays.sort(numbers); // �������� ����
		
		System.out.println("\n���ĵ� ����Ʈ : ");
		for(int r : numbers) {
			System.out.print(r + " ");
		}
	}
}
