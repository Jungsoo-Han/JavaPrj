import java.util.Scanner;

public class OmokProgram3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width = 20;
		int height = 20;

		// ������ �迭
		char[][] board = new char[width][height];
		int[] xs = new int[width * height];
		int[] ys = new int[width * height];
		int[] types = new int[width * height];

		// ������ �ʱ�ȭ
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				board[y][x] = '��';

		// �׵θ� �׸��� : ���ڷ��̼�

		for (int i = 0; i < width; i++)
			board[0][i] = '��';
		for (int i = 0; i < width; i++)
			board[height - 1][i] = '��';
		for (int i = 0; i < height; i++)
			board[i][0] = '��';
		for (int i = 0; i < width; i++)
			board[i][width - 1] = '��';

		board[0][0] = '��';
		board[0][width - 1] = '��';
		board[height - 1][0] = '��';
		board[height - 1][width - 1] = '��';

		// ����� �Է¿� ���� ��ġ�� ������ �δ� ����
		int count = 0;
		int ox = 0;
		int oy = 0;
		int type = 0;

		while (true) {
			System.out.print("��ġ�� �Է��ϼ��� x sp y  : ");
			ox = scan.nextInt();
			oy = scan.nextInt();
			xs[count] = ox;
			ys[count] = oy;
			types[count] = type; // Ȧ���� �Ͼᵹ, ¦���� ������
			count++;
			type++;
			if (type%2 == 0) {
				board[oy][ox] = '��';
			} else board[oy][ox] = '��';

			/*for (int i = 0; i < count; i++) {
				board[(ys[i] - 1)][(xs[i] - 1)] = '��';
			}*/
			// ������ ���

			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}

		}
	}
}
