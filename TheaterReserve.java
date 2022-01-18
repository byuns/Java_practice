// ���� ���� �ý��� (= �¼� 10��, ���� o = 1, ���� x = 0)
// ���� ��� �߰�

package Test;
import java.util.Scanner;

public class TheaterReserve {
	public static void main(String[] args) {
		final int size = 10;
		int[] seats = new int[size];
		
		while(true) {
			System.out.println("-----------------------");
			for(int i=0; i<size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n-----------------------");
			for(int i = 0;i<size;i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println("\n-----------------------");
			
			System.out.println("���Ͻô� �¼���ȣ�� �Է��ϼ���(�����  -1, ���� ��Ҵ� 0): ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			
			else if(s == 0) {
				System.out.println("���� ��� �޴� �Դϴ�. ����� ��ȣ�� �Է��ϼ���.");
				int change = scan.nextInt();
				if(seats[change-1] == 1) {
					seats[change-1] = 0;
				}
				else {
					System.out.println("����� �¼��� �ƴմϴ�. �ٽ�  0�� �Է����ּ���.");
				}
				
			}
			else if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
			
		}
	}

}
