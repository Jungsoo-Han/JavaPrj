import java.util.Scanner;

public class OmokProgram4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width = 20; // 가로 길이
		int height = 20; // 세로 길이

		// 오목판 배열
		char[][] board = new char[width][height]; // 오목판 초기화
		char[][] checkArray = new char[9][9];
		int[] xs = new int[width * height]; // int 크기 400개 가로 배열
		int[] ys = new int[width * height]; // int 크기 400개 세로 배열
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
		System.out.println("첫번째 유저를 입력하세요 : ");
		final String user1 = scan.nextLine();
		System.out.println("두번째 유저를 입력하세요 : ");
		final String user2 = scan.nextLine();

		int count = 0;
		int ox = 0;
		int oy = 0;
		int type = 0;

		do {
			System.out.println(user1 + " VS " + user2);
			System.out.print("위치를 입력하세요 x sp y  : ");
			ox = scan.nextInt();
			oy = scan.nextInt();
			xs[count] = ox;
			ys[count] = oy;
			types[count] = type; // 홀수면 하얀돌, 짝수면 검은돌

			int equal_num = 0; // 중복된 숫자가 없을경우 0, 중복된 숫자가 있을경우 1
			for (int i = 0; i < count; i++) {
				// xs[count], xy[count] 입력값 2개를 동시 비교함. 동일한 값이 들어왔을 경우 중복숫자값을 1로 표기.
				if ((xs[i] == ox) && (ys[i] == oy)) {
					equal_num = 1;
				}
			}

			// 홀수짝수를 구하되 중복된 숫자가 없을 경우에만 명령 수행.
			if ((type % 2 == 0) && (equal_num == 0)) {
				board[oy][ox] = '○';
				count++;
				type++;
			} else if ((type % 2 == 1) && (equal_num == 0)) {
				board[oy][ox] = '●';
				count++;
				type++;
			}

			// 오목판 출력
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}

			if (equal_num == 1) {
				System.out.println("중복된 위치에 두셨습니다. 위치를 다시 입력하시기 바랍니다.");
			}

			// 승리판별
			
		} while (true);
	}
}