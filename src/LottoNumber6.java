import java.util.Random;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class LottoNumber6 {

	public static void main(String[] args) {
		// 메인 메뉴 입력

		int[][] lottos = new int[10][6];
		int current = -1;
		int count = 0;
		boolean exit = true;

		while(exit == true) {

			//exit_sub:
				switch (inputMainMenu()) {
			case 1:
				// 로또 자동 생성
				auto_GenerateNumber(lottos, current, count);
				break;
			case 2:
				// 로또 수동 생성
				// 수동 번호 입력
				manual_InputNumber(lottos, count);
				break;
			case 3:
				// 로또 번호 출력
				printLottos(lottos, current);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				exit = false;
				break;

			default:
				break;
			}
		}
	}

	// 로또 수동 입력
	private static void manual_InputNumber(int[][] lottos, int count) {
		Scanner scan = new Scanner(System.in);
		count = inputLottoCount(count);
		int number = 0;
		System.out.println("로또 번호를 입력하세요 (sp로 구분)");
		
		
		for (int i = 0; i < 6; i++) {
			number = scan.nextInt();
			for (int j = count; j < lottos.length; j++) {
				lottos[j][i] = number;
			}
			count++;
		}
	}

	// 로또 자동 입력
	private static void auto_GenerateNumber(int[][] lottos, int current, int count) {
		
		System.out.println("-------------------------------------");
		System.out.println("	로또 번호 자동생성");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("자동으로 뽑고 싶은 횟수를 입력하세요");
		
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

	// 로또 번호 출력
	private static void printLottos(int[][] lottos, int count) {
		for (int i = 0; i < count; i++) {
			int[] lotto = lottos[i];
			System.out.printf("%d : %2d %2d %2d %2d %2d %2d\n",
					i + 1, lotto[0], lotto[1], lotto[2],
					lotto[3], lotto[4], lotto[5]);
		}
		System.out.println();	
		
	}

	// 로또 반복 횟수 입력
	private static int inputLottoCount(int count) {
		Scanner scan = new Scanner(System.in);
		
		count = scan.nextInt();
		
		return count;
	}

	// 메인 메뉴
	private static int inputMainMenu() {
		
		Scanner scan = new Scanner(System.in);
		int menu;
		
		System.out.println("-------------------------------------");
		System.out.println("	로또 관리 프로그램");
		System.out.println("-------------------------------------");
		System.out.println("1. 번호 자동 생성");
		System.out.println("2. 번호 수동 입력");
		System.out.println("3. 번호 출력");
		System.out.println("4. 종료");
		
		menu = scan.nextInt();
		
		return menu;
	}
}
