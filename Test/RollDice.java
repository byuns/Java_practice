//6면 주사위 1만 번 후, 빈도 출력


package Test;

public class RollDice {
	public static void main(String[] args) {
		final int SIZE = 6;
		int freq[] = new int[SIZE];
		
		for(int i=0;i<10000; i++) {
			++freq[(int) (Math.random() * SIZE)];
		}
		
		System.out.println("=====================");
		System.out.println("면	빈도");
		System.out.println("=====================");
		
		for(int i = 0; i<SIZE;i++) {
			System.out.println("" + (i + 1) +"	" + freq[i]);
		}
	}

}
