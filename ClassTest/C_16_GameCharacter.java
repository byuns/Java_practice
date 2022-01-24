//���� Ŭ���� ��� ����
package ClassTest;
import java.util.ArrayList;

public class C_16_GameCharacter {
	private class GameItem{ // ���� Ŭ������ ���� (private�� ����)
		String name;
		int type;
		int price;
		
		int getPrice() {
				return price;
			}

		@Override
		public String toString() {
				return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
			}
		}
		private ArrayList<GameItem> list = new ArrayList<>();
		
		public void add(String name, int type, int price) {
			GameItem item = new GameItem();
			item.name = name;
			item.type = type;
			item.price  = price;
			list.add(item);
		}
		
		public void print() {
			int total = 0;
			for(GameItem item : list) {
				System.out.println(item);
				total += item.getPrice();
			}
			System.out.println(total);
		}
		

	}

