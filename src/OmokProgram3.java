import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width = 20;
		int height = 20;

		// 오목판 배열
		char[][] board = new char[width][height];
		int[] xs = new int[width * height];
		int[] ys = new int[width * height];
		int[] types = new int[width * height];

		// 오목판 초기화
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				board[y][x] = '┿';

		// 테두리 그리기 : 데코레이션

		for (int i = 0; i < width; i++)
			board[0][i] = '┬';
		for (int i = 0; i < width; i++)
			board[height - 1][i] = '┴';
		for (int i = 0; i < height; i++)
			board[i][0] = '├';
		for (int i = 0; i < width; i++)
			board[i][width - 1] = '┤';

		board[0][0] = '┌';
		board[0][width - 1] = '┐';
		board[height - 1][0] = '└';
		board[height - 1][width - 1] = '┘';

		// 사용자 입력에 대한 위치에 오목을 두는 로직
		int count = 0;
		int ox = 0;
		int oy = 0;
		int type = 0;

		while (true) {
			System.out.print("위치를 입력하세요 x sp y  : ");
			ox = scan.nextInt();
			oy = scan.nextInt();
			xs[count] = ox;
			ys[count] = oy;
			types[count] = type; // 홀수면 하얀돌, 짝수면 검은돌
			count++;
			type++;
			if (type%2 == 0) {
				board[oy][ox] = '○';
			} else board[oy][ox] = '●';

			/*for (int i = 0; i < count; i++) {
				board[(ys[i] - 1)][(xs[i] - 1)] = '○';
			}*/
			// 오목판 출력

			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}

		}
	}
}
