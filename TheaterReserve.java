// 극장 예약 시스템 (= 좌석 10개, 예약 o = 1, 예약 x = 0)
// 예약 취소 추가

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
			
			System.out.println("원하시는 좌석번호를 입력하세요(종료는  -1, 예약 취소는 0): ");
			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			else if(s == 0) {
				System.out.println("예약 취소 메뉴 입니다. 취소할 번호를 입력하세요.");
				int change = scan.nextInt();
				if(seats[change-1] == 1) {
					seats[change-1] = 0;
				}
				else {
					System.out.println("예약된 좌석이 아닙니다. 다시  0을 입력해주세요.");
				}
				
			}
			else if(seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
			
		}
	}

}
