package ClassTest;

public class C_01_TelevisionTest {
	public static void main(String[] args) {
		C_01_Television my_tv = new C_01_Television();
		my_tv.channel = 7;
		my_tv.volume = 9;
		my_tv.onOff = true;
		
		C_01_Television your_tv = new C_01_Television();
		your_tv.channel = 9;
		your_tv.volume = 12;
		your_tv.onOff = true;
		
		System.out.println("���� �ڷ������� ä���� " + my_tv.channel + "�̰� ������ "+ my_tv.volume + "�Դϴ�.");
		System.out.println("���� �ڷ������� ä���� " + your_tv.channel + "�̰� ������ "+ your_tv.volume + "�Դϴ�.");
	}

}
