// Tic-Tac-Toe >> 에러 잡기 및 성능 업그레이드
// 조금 더 지능적으로 두게 할 필요성이 있음 추후수정


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
			System.out.print("다음 수의 좌표를 입력하시오.\n");
			System.out.print("X : ");
			x = scan.nextInt();
			System.out.print("\nY : ");
			y = scan.nextInt();
			
			if(board[x][y] != ' ') {
				if(board[x][y] == 'O')
					System.out.println("컴퓨터가 놓은 자리입니다.\n다시 입력해주세요.");
				else
					System.out.println("본인이 놓은 자리입니다. \n다시 입력해주세요.");
			
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
						System.out.println("컴퓨터 승!");
						break;
					}
					else if(board[i][0] == 'X') {
						r = false;
						System.out.println("사용자 승!");
						break;
					}
				else if(board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
						if(board[0][i] == 'O') { 
							r = false;
							System.out.println("컴퓨터 승!");
							break;
						}
						else if(board[0][i] == 'X') { 
							r = false;
							System.out.println("사용자 승!");
							break;
						}
					}
				}
			}
		}while(r);
	}

}
