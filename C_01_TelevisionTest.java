package ClassTest;

public class C_01_TelevisionTest {
	public static void main(String[] args) {
		C_01_Television tv = new C_01_Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		
		System.out.println("�ڷ������� ä���� " + tv.channel + "�̰� ������ "+ tv.volume + "�Դϴ�.");
	}

}
