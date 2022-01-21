// 접근자&설정자 (get,set)
package ClassTest;

public class C_06_AccountTest {
	public static void main(String[] args) {
		C_06_Account obj = new C_06_Account();
		
		obj.setName("Tom");
		obj.setBalance(100000);
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 "+ obj.getBalance() + "입니다.");
	}

}

// 1. 접근자와 설정자를 사용해야만 나중에 클래스를 업그레이드할 때 편하다.
// 2. 접근자에서 매개 변수를 통하여 잘못된 값이 넘어오는 경우, 이를 사전에 차단할 수 있다.
// 3. 필요할 때마다 필드값을 계산하여 반환할 수 있다.
// 4. 접근자만을 제공하면 자동적으로 읽기만 가능한 필드를 만들 수 있다.