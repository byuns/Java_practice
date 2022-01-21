package Test;
import java.util.Scanner;

public class StringTest_ap {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요 > ");
			str = sc.next();
			
			if(str.equals("quit") == true) {
				System.out.println("종료합니다.");
				break;
			}
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + "은 'www'로 시작합니다.");
			}
			else {
				System.out.println(str + "은 'www'로 시작하지 않습니다.");
			}
		}
		
		
		
//		String st = "new";
//		if(st.matches("n(.+)")) { // result = s
//			System.out.println("s");
//		}
	}

}
