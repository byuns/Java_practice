package Test;
import java.util.Scanner;

public class StringTest_ap {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ��� > ");
			str = sc.next();
			
			if(str.equals("quit") == true) {
				System.out.println("�����մϴ�.");
				break;
			}
			if(str.matches("^www\\.(.+)")) {
				System.out.println(str + "�� 'www'�� �����մϴ�.");
			}
			else {
				System.out.println(str + "�� 'www'�� �������� �ʽ��ϴ�.");
			}
		}
		
		
		
//		String st = "new";
//		if(st.matches("n(.+)")) { // result = s
//			System.out.println("s");
//		}
	}

}
