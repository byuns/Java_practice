// Tic-Tac-Toe >> ���� ��� �� ���� ���׷��̵�
// ���� �� ���������� �ΰ� �� �ʿ伺�� ���� ���ļ���


package Test;
import java.util.Scanner;

public class Tic_Tac_Toe {
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		int x,y;
		boolean r = true;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[i].length; j++) {
				board[i][j] =' ';
			}
		}
		
		do {
			for(int i = 0; i < board.length; i++) {
				System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);
				if (i != 2)
					System.out.println("---|---|---");
			}
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�.\n");
			System.out.print("X : ");
			x = scan.nextInt();
			System.out.print("\nY : ");
			y = scan.nextInt();
			
			if(board[x][y] != ' ') {
				if(board[x][y] == 'O')
					System.out.println("��ǻ�Ͱ� ���� �ڸ��Դϴ�.\n�ٽ� �Է����ּ���.");
				else
					System.out.println("������ ���� �ڸ��Դϴ�. \n�ٽ� �Է����ּ���.");
			
			}else {
				board[x][y] = 'X';
				
				
				int i = 0, j = 0;
				for(i = 0; i<board.length; i++) {
					for(j = 0; j<board[i].length; j++) 
						if(board[i][j] == ' ') 
							break;
					if(board[i][j] == ' ') 
						break;

				}
				if (i<board.length && j < board[i].length) 
				board[i][j] = 'O';
			}
			
			for(int i = 0; i<board.length; i++) {
				if(board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
					if (board[i][0] == 'O') {
						r = false;
						System.out.println("��ǻ�� ��!");
						break;
					}
					else if(board[i][0] == 'X') {
						r = false;
						System.out.println("����� ��!");
						break;
					}
				else if(board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
						if(board[0][i] == 'O') { 
							r = false;
							System.out.println("��ǻ�� ��!");
							break;
						}
						else if(board[0][i] == 'X') { 
							r = false;
							System.out.println("����� ��!");
							break;
						}
					}
				}
			}
		}while(r);
	}

}
