// String Ŭ���� ����ϱ� 
// new ������ ���� ����
package Test;

public class StringTest {
	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1,s2,s3,s4;
		
		System.out.println("���ڿ��� ���� = " + proverb.length());
		
		s1 = proverb.concat(" never Bites!"); // ���ڿ� ����
		s2 = proverb.replace('b', 'B'); // ���� ��ȯ
		s3 = proverb.substring(2,5);// �κ� ���ڿ� ����
		s4 = proverb.toUpperCase(); // �빮�ڷ� ��ȯ
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
