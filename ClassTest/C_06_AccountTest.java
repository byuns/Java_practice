// ������&������ (get,set)
package ClassTest;

public class C_06_AccountTest {
	public static void main(String[] args) {
		C_06_Account obj = new C_06_Account();
		
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("�̸��� " + obj.getName() + " ���� �ܰ�� "+ obj.getBalance() + "�Դϴ�.");
	}

}

// 1. �����ڿ� �����ڸ� ����ؾ߸� ���߿� Ŭ������ ���׷��̵��� �� ���ϴ�.
// 2. �����ڿ��� �Ű� ������ ���Ͽ� �߸��� ���� �Ѿ���� ���, �̸� ������ ������ �� �ִ�.
// 3. �ʿ��� ������ �ʵ尪�� ����Ͽ� ��ȯ�� �� �ִ�.
// 4. �����ڸ��� �����ϸ� �ڵ������� �б⸸ ������ �ʵ带 ���� �� �ִ�.