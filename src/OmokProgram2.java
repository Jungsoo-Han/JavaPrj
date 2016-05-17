import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {

		int width = 20;
		int height = 20;
		
		// 오목판 배열
		char[] board = new char[width * height];
		
		// 오목판 초기화
		for (int i = 0; i < 400; i++) {
			board[i] = '┿';
		}
		// 좌표를 이용한 오목 두기 또는 테두리 그리기(두기)
		board[width*0+0] = '┌';
		board[0*width+19] = '┐';
		board[19*width+0] = '└';
		board[19*width+19] = '┘';
		board[4*width + 3] = '○';
		
		// 오목판 출력
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print(board[y*height+x]); // y 축을 쭉 출력시켜놓고 x축으로 하나씩 더해나간다
			}
			System.out.println();
		}
		
	}
}
