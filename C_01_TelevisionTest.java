package ClassTest;

public class C_01_TelevisionTest {
	public static void main(String[] args) {
		C_01_Television tv = new C_01_Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 "+ tv.volume + "입니다.");
	}

}
