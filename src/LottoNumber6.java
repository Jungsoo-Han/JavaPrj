import java.util.Random;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class LottoNumber6 {

	public static void main(String[] args) {
		// ���� �޴� �Է�

		int[][] lottos = new int[10][6];
		int current = -1;
		int count = 0;
		boolean exit = true;

		while(exit == true) {

			//exit_sub:
				switch (inputMainMenu()) {
			case 1:
				// �ζ� �ڵ� ����
				auto_GenerateNumber(lottos, current, count);
				break;
			case 2:
				// �ζ� ���� ����
				// ���� ��ȣ �Է�
				manual_InputNumber(lottos, count);
				break;
			case 3:
				// �ζ� ��ȣ ���
				printLottos(lottos, current);
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				exit = false;
				break;

			default:
				break;
			}
		}
	}

	// �ζ� ���� �Է�
	private static void manual_InputNumber(int[][] lottos, int count) {
		Scanner scan = new Scanner(System.in);
		count = inputLottoCount(count);
		int number = 0;
		System.out.println("�ζ� ��ȣ�� �Է��ϼ��� (sp�� ����)");
		
		
		for (int i = 0; i < 6; i++) {
			number = scan.nextInt();
			for (int j = count; j < lottos.length; j++) {
				lottos[j][i] = number;
			}
			count++;
		}
	}

	// �ζ� �ڵ� �Է�
	private static void auto_GenerateNumber(int[][] lottos, int current, int count) {
		
		System.out.println("-------------------------------------");
		System.out.println("	�ζ� ��ȣ �ڵ�����");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("�ڵ����� �̰� ���� Ƚ���� �Է��ϼ���");
		
		count = inputLottoCount(count);
		Random rand = new Random();
		int[] lotto = new int[6];
		
		for(int k = 0; k<count; k++){
			
			for (int i = 0; i < 6; i++) {
				lotto[i] = rand.nextInt(45) + 1;
				
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i -= 1;
						break;
					}
				}
			}
			current++;
			for (int i = 0; i < 6; i++) {
				lottos[current][i] = lotto[i];
			}
		}
		printLottos(lottos, current);
	}

	// �ζ� ��ȣ ���
	private static void printLottos(int[][] lottos, int count) {
		for (int i = 0; i < count; i++) {
			int[] lotto = lottos[i];
			System.out.printf("%d : %2d %2d %2d %2d %2d %2d\n",
					i + 1, lotto[0], lotto[1], lotto[2],
					lotto[3], lotto[4], lotto[5]);
		}
		System.out.println();	
		
	}

	// �ζ� �ݺ� Ƚ�� �Է�
	private static int inputLottoCount(int count) {
		Scanner scan = new Scanner(System.in);
		
		count = scan.nextInt();
		
		return count;
	}

	// ���� �޴�
	private static int inputMainMenu() {
		
		Scanner scan = new Scanner(System.in);
		int menu;
		
		System.out.println("-------------------------------------");
		System.out.println("	�ζ� ���� ���α׷�");
		System.out.println("-------------------------------------");
		System.out.println("1. ��ȣ �ڵ� ����");
		System.out.println("2. ��ȣ ���� �Է�");
		System.out.println("3. ��ȣ ���");
		System.out.println("4. ����");
		
		menu = scan.nextInt();
		
		return menu;
	}
}
