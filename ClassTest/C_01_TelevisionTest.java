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
		
		System.out.println("나의 텔레비전의 채널은 " + my_tv.channel + "이고 볼륨은 "+ my_tv.volume + "입니다.");
		System.out.println("너의 텔레비전의 채널은 " + your_tv.channel + "이고 볼륨은 "+ your_tv.volume + "입니다.");
	}

}
