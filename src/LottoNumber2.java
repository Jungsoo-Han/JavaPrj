//2�� �迭
import java.util.Random;

public class LottoNumber2 {

	public static void main(String[] args) {

		Random rand = new Random();
		// Scanner scan = new Scanner(System.in);

		int[] lotto = new int[6];
		// int bonus = 0;
		int temp = 0;

		// ���� : �ߺ� �˻� �Է�
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i -= 1;
					break;
				}
			}
		}
		
		// ��ȣ ���
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d, ", lotto[i]);
		}
		

		// ���� �ϱ�
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5 - j; i++) {
				if (lotto[i] > lotto[i + 1]) {
					temp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = temp;
				}
			}
		}

		// ��ȣ ���
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d, ", lotto[i]);
		}
		System.out.println();
	}

}
