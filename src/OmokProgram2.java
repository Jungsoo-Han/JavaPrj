import java.util.Scanner;

public class OmokProgram2 {

	public static void main(String[] args) {

		int width = 20;
		int height = 20;
		
		// ������ �迭
		char[] board = new char[width * height];
		
		// ������ �ʱ�ȭ
		for (int i = 0; i < 400; i++) {
			board[i] = '��';
		}
		// ��ǥ�� �̿��� ���� �α� �Ǵ� �׵θ� �׸���(�α�)
		board[width*0+0] = '��';
		board[0*width+19] = '��';
		board[19*width+0] = '��';
		board[19*width+19] = '��';
		board[4*width + 3] = '��';
		
		// ������ ���
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				System.out.print(board[y*height+x]); // y ���� �� ��½��ѳ��� x������ �ϳ��� ���س�����
			}
			System.out.println();
		}
		
	}
}
