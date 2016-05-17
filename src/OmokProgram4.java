import java.util.Scanner;

public class OmokProgram4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int width = 20; // ���� ����
		int height = 20; // ���� ����

		// ������ �迭
		char[][] board = new char[width][height]; // ������ �ʱ�ȭ
		char[][] checkArray = new char[9][9];
		int[] xs = new int[width * height]; // int ũ�� 400�� ���� �迭
		int[] ys = new int[width * height]; // int ũ�� 400�� ���� �迭
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
		System.out.println("ù��° ������ �Է��ϼ��� : ");
		final String user1 = scan.nextLine();
		System.out.println("�ι�° ������ �Է��ϼ��� : ");
		final String user2 = scan.nextLine();

		int count = 0;
		int ox = 0;
		int oy = 0;
		int type = 0;

		do {
			System.out.println(user1 + " VS " + user2);
			System.out.print("��ġ�� �Է��ϼ��� x sp y  : ");
			ox = scan.nextInt();
			oy = scan.nextInt();
			xs[count] = ox;
			ys[count] = oy;
			types[count] = type; // Ȧ���� �Ͼᵹ, ¦���� ������

			int equal_num = 0; // �ߺ��� ���ڰ� ������� 0, �ߺ��� ���ڰ� ������� 1
			for (int i = 0; i < count; i++) {
				// xs[count], xy[count] �Է°� 2���� ���� ����. ������ ���� ������ ��� �ߺ����ڰ��� 1�� ǥ��.
				if ((xs[i] == ox) && (ys[i] == oy)) {
					equal_num = 1;
				}
			}

			// Ȧ��¦���� ���ϵ� �ߺ��� ���ڰ� ���� ��쿡�� ��� ����.
			if ((type % 2 == 0) && (equal_num == 0)) {
				board[oy][ox] = '��';
				count++;
				type++;
			} else if ((type % 2 == 1) && (equal_num == 0)) {
				board[oy][ox] = '��';
				count++;
				type++;
			}

			// ������ ���
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					System.out.printf("%c", board[y][x]);
				}
				System.out.println();
			}

			if (equal_num == 1) {
				System.out.println("�ߺ��� ��ġ�� �μ̽��ϴ�. ��ġ�� �ٽ� �Է��Ͻñ� �ٶ��ϴ�.");
			}

			// �¸��Ǻ�
			
		} while (true);
	}
}