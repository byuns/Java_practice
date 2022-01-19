//ArrayList<> 기본 사용법

import java.util.ArrayList;
public class ArrayList_test_easy {
	public static void main(String[] args) {
		ArrayList<String> list_s = new ArrayList<>();
		ArrayList<Integer> list_i = new ArrayList<>();
		
		list_s.add("철수");
		list_s.add("영희");
//		list_s.remove(1); // 1번 째 요소 삭제
		System.out.println(list_s);
		for(int i = 0; i<list_s.size(); i++) {
			System.out.println(list_s.get(i));
		}
		
		list_i.add(98);
		int firstNumber = list_i.get(0);
		System.out.print(firstNumber);
	}

}
